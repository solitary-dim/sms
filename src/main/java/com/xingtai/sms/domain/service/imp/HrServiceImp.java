package com.xingtai.sms.domain.service.imp;

import com.xingtai.sms.domain.dao.HrDao;
import com.xingtai.sms.domain.dao.imp.HrDaoImp;
import com.xingtai.sms.domain.entity.Hr;
import com.xingtai.sms.domain.service.HrService;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class HrServiceImp implements HrService {
	HrDao hr=new HrDaoImp();

	//登录，输入用户名和密码查询信息
	public Hr checkall(String husername, String hpwd) {
		return hr.checkall(husername, hpwd);
	}

	//根据超管Id查询超级管理员信息
	public Hr selectHrById(int hid) {
		return hr.selectHrById(hid);
	}

	public boolean updateHrById(int hid, String husername, String hmobileno,
			String hemail) {
		// TODO Auto-generated method stub
		return hr.updateHrById(hid, husername, hmobileno, hemail);
	}

	public boolean updateHrById(int hid, String hpwd) {
		// TODO Auto-generated method stub
		return hr.updateHrById(hid, hpwd);
	}

}