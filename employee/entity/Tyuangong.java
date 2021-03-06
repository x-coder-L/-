/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.employee.entity;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * employeeEntity
 * @author LX
 * @version 2021-01-09
 */
@Table(name="t_yuangong", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="org_id", attrName="orgId", label="部门号"),
		@Column(name="eid", attrName="eid", label="员工号"),
		@Column(name="name", attrName="name", label="姓名", queryType=QueryType.LIKE),
		@Column(name="sex", attrName="sex", label="性别"),
		@Column(name="age", attrName="age", label="年龄"),
		@Column(name="zhiwei", attrName="zhiwei", label="职位"),
		@Column(name="shifoubumenlingdao", attrName="shifoubumenlingdao", label="是否部门经理"),
		@Column(name="loginname", attrName="loginname", label="登录名"),
		@Column(name="loginpw", attrName="loginpw", label="密码"),
		@Column(name="del", attrName="del", label="del", isInsert=false, isUpdate=false, isQuery=false),
	}, orderBy="a.id DESC"
)
public class Tyuangong extends DataEntity<Tyuangong> {
	
	private static final long serialVersionUID = 1L;
	private Long orgId;		// 部门号
	private String eid;		// 员工号
	private String name;		// 姓名
	private String sex;		// 性别
	private String age;		// 年龄
	private String zhiwei;		// 职位
	private String shifoubumenlingdao;		// 是否部门经理
	private String loginname;		// 登录名
	private String loginpw;		// 密码
	private String del;		// del
	
	public Tyuangong() {
		this(null);
	}

	public Tyuangong(String id){
		super(id);
	}
	
	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	
	@NotBlank(message="员工号不能为空")
	@Length(min=0, max=55, message="员工号长度不能超过 55 个字符")
	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}
	
	@Length(min=0, max=50, message="姓名长度不能超过 50 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=50, message="性别长度不能超过 50 个字符")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=50, message="年龄长度不能超过 50 个字符")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Length(min=0, max=50, message="职位长度不能超过 50 个字符")
	public String getZhiwei() {
		return zhiwei;
	}

	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	@Length(min=0, max=50, message="是否部门经理长度不能超过 50 个字符")
	public String getShifoubumenlingdao() {
		return shifoubumenlingdao;
	}

	public void setShifoubumenlingdao(String shifoubumenlingdao) {
		this.shifoubumenlingdao = shifoubumenlingdao;
	}
	
	@Length(min=0, max=50, message="登录名长度不能超过 50 个字符")
	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	@Length(min=0, max=50, message="密码长度不能超过 50 个字符")
	public String getLoginpw() {
		return loginpw;
	}

	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}
	
	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}
	
}