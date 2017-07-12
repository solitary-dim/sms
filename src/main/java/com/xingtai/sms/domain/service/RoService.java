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
	
	boolean checkname(String rusername);
	boolean checkpwd(String rpwd);
	Ro checkall(String rusername, String rpwd);
	List<Ro> showRo();
	Ro selectRoById(int rid);
	boolean updateRoById(int rid, String rusername, String rmobileno, String remail);
	boolean updateRoById(int rid, String rpwd);
	boolean addRo(String rusername, String rpwd, String rname, String rsex, int rage, String remail, String rmobileno, String rno);
	boolean deleteRoById(int rid);
	boolean UpdateRoById(int rid, String rusername, String rname, String rsex, int rage, String remail, String rmobileno, String rcompany, String rno, String rteam);
	List<Ro> selectRoByTeam(String rteam);
	boolean updatePer(String rteam, int rperformance);

}
