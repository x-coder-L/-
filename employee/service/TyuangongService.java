/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.employee.entity.Tyuangong;
import com.jeesite.modules.employee.dao.TyuangongDao;

/**
 * employeeService
 * @author LX
 * @version 2021-01-09
 */
@Service
@Transactional(readOnly=true)
public class TyuangongService extends CrudService<TyuangongDao, Tyuangong> {
	
	/**
	 * 获取单条数据
	 * @param tyuangong
	 * @return
	 */
	@Override
	public Tyuangong get(Tyuangong tyuangong) {
		return super.get(tyuangong);
	}
	
	/**
	 * 查询分页数据
	 * @param tyuangong 查询条件
	 * @param tyuangong.page 分页对象
	 * @return
	 */
	@Override
	public Page<Tyuangong> findPage(Tyuangong tyuangong) {
		return super.findPage(tyuangong);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tyuangong
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(Tyuangong tyuangong) {
		super.save(tyuangong);
	}
	
	/**
	 * 更新状态
	 * @param tyuangong
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(Tyuangong tyuangong) {
		super.updateStatus(tyuangong);
	}
	
	/**
	 * 删除数据
	 * @param tyuangong
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(Tyuangong tyuangong) {
		super.delete(tyuangong);
	}
	
}