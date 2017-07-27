package com.xingtai.sms.dao;

import java.util.List;

import com.xingtai.sms.entity.Ro;


public interface RoDao {
	
	public boolean checkname(String rusername);
	public boolean checkpwd(String rpwd);
	public Ro checkall(String rusername,String rpwd);
	public List<Ro> showRo();
	public Ro SelectRoById(int rid);
	public boolean UpdateRoById(int rid, String rusername,
			String rmobileno, String remail);
	public boolean UpdateRoById(int rid, String rpwd);
	public boolean addRo(String rusername, String rpwd, String rname, String rsex, int rage, String remail, String rmobileno, String rno);
	public boolean UpdateRoById(int rid, String rusername, String rname, String rsex, int rage, String remail, String rmobileno, String rcompany, String rno, String rteam);
	public boolean deleteRoById(int rid);
	public List<Ro> selectRoByTeam(String rteam);
	public boolean updatePer(String rteam,int rperformance);

}
