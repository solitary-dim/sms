package com.xingtai.sms.domain.dao;

import com.xingtai.sms.domain.entity.Hr;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface HrDao {
	boolean checkname(String husername);
	boolean checkpwd(String hpwd);
	Hr checkall(String husername, String hpwd);
	Hr selectHrById(int hid);
	boolean updateHrById(int hid, String husername,
								String hmobileno, String hemail);
	boolean updateHrById(int hid, String hpwd);
}