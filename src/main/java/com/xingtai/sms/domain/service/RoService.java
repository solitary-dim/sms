package com.xingtai.sms.domain.service;

import com.xingtai.sms.domain.entity.Ro;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface RoService {
	
	public boolean checkname(String rusername);
	public boolean checkpwd(String rpwd);
	public Ro checkall(String rusername, String rpwd);
	public List<Ro> showRo();
	public Ro selectRoById(int rid);
	public boolean updateRoById(int rid, String rusername, String rmobileno, String remail);
	public boolean updateRoById(int rid, String rpwd);
	public boolean addRo(String rusername, String rpwd, String rname, String rsex, int rage, String remail, String rmobileno, String rno);
	public boolean deleteRoById(int rid);
	public boolean UpdateRoById(int rid, String rusername, String rname, String rsex, int rage, String remail, String rmobileno, String rcompany, String rno, String rteam);
	public List<Ro> selectRoByTeam(String rteam);
	public boolean updatePer(String rteam, int rperformance);

}
