package com.xingtai.sms.domain.service;

import com.xingtai.sms.domain.entity.Hr;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface HrService {
	Hr checkall(String husername, String hpwd);
	Hr selectHrById(int hid);
	boolean updateHrById(int hid, String husername,
								String hmobileno, String hemail);
	boolean updateHrById(int hid, String hpwd);
}
