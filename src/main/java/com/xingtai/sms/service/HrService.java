package com.xingtai.sms.service;

import com.xingtai.sms.entity.Hr;

public interface HrService {
	public Hr checkall(String husername,String hpwd);
	public Hr selectHrById(int hid);
	public boolean updateHrById(int hid,String husername,
			String hmobileno,String hemail);
	public boolean updateHrById(int hid,String hpwd);
}
