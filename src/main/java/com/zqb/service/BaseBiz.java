package com.zqb.service;

import javax.annotation.Resource;

import com.zqb.dao.BaseDao;


public abstract class BaseBiz {
	protected BaseDao baseDao;
	
	@Resource(name = "baseDaoImpl")
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
}
