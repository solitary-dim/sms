package com.xingtai.sms.domain.dao;

import com.xingtai.sms.domain.entity.Hr;
import com.xingtai.sms.domain.entity.Hr;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface HrDao {
	public boolean checkname(String husername);
	public boolean checkpwd(String hpwd);
	public Hr checkall(String husername, String hpwd);
	public Hr selectHrById(int hid);
	public boolean updateHrById(int hid, String husername,
								String hmobileno, String hemail);
	public boolean updateHrById(int hid, String hpwd);
}