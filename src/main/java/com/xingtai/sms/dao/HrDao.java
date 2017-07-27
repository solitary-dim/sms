package com.xingtai.sms.dao;

import com.xingtai.sms.entity.Hr;

public interface HrDao {
	public boolean checkname(String husername);
	public boolean checkpwd(String hpwd);
	public Hr checkall(String husername,String hpwd);
	public Hr selectHrById(int hid);
	public boolean updateHrById(int hid,String husername,
			String hmobileno,String hemail);
	public boolean updateHrById(int hid,String hpwd);
}