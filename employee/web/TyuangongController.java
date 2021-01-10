/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.employee.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.employee.entity.Tyuangong;
import com.jeesite.modules.employee.service.TyuangongService;

/**
 * employeeController
 * @author LX
 * @version 2021-01-09
 */
@Controller
@RequestMapping(value = "${adminPath}/employee/tyuangong")
public class TyuangongController extends BaseController {

	@Autowired
	private TyuangongService tyuangongService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public Tyuangong get(String id, boolean isNewRecord) {
		return tyuangongService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("employee:tyuangong:view")
	@RequestMapping(value = {"list", ""})
	public String list(Tyuangong tyuangong, Model model) {
		model.addAttribute("tyuangong", tyuangong);
		return "modules/employee/tyuangongList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("employee:tyuangong:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<Tyuangong> listData(Tyuangong tyuangong, HttpServletRequest request, HttpServletResponse response) {
		tyuangong.setPage(new Page<>(request, response));
		Page<Tyuangong> page = tyuangongService.findPage(tyuangong);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("employee:tyuangong:view")
	@RequestMapping(value = "form")
	public String form(Tyuangong tyuangong, Model model) {
		model.addAttribute("tyuangong", tyuangong);
		return "modules/employee/tyuangongForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("employee:tyuangong:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated Tyuangong tyuangong) {
		tyuangongService.save(tyuangong);
		return renderResult(Global.TRUE, text("保存employee成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("employee:tyuangong:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(Tyuangong tyuangong) {
		tyuangongService.delete(tyuangong);
		return renderResult(Global.TRUE, text("删除employee成功！"));
	}
	
}