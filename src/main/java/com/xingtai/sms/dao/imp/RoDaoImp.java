package com.xingtai.sms.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xingtai.sms.dao.RoDao;
import com.xingtai.sms.entity.Ro;
import com.xingtai.sms.jdbc.JdbcUtil;

public class RoDaoImp implements RoDao {
	
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;

	public Ro SelectRoById(int rid) {
		String sql="select * from ro where rid=?";
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setInt(1, rid);
			rs=pst.executeQuery();
			Ro ro=new Ro();
			while(rs.next()){
				ro.setRusername(rs.getString(1));
				ro.setRpwd(rs.getString(2));
				ro.setRname(rs.getString(3));
				ro.setRid(rs.getInt(4));
				ro.setRsex(rs.getString(5));
				ro.setRage(rs.getInt(6));
				ro.setRemail(rs.getString(7));
				ro.setRmobileno(rs.getString(8));
				ro.setRcompany(rs.getString(9));
				ro.setRno(rs.getString(10));
				ro.setRperformance(rs.getInt(11));
				ro.setRteam(rs.getString(12));
			}
			return ro;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
	}

	public boolean UpdateRoById(int rid, String rusername, String rmobileno,
			String remail) {
		String sql="update ro set rusername=?, rmobileno=?, remail=? where rid=?";
		con=JdbcUtil.getCon();
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, rusername);
			pst.setString(2, rmobileno);
			pst.setString(3, remail);
			pst.setInt(4, rid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		
		return false;
	}

	public boolean UpdateRoById(int rid, String rpwd) {
		String sql="update ro set rpwd=? where rid=?";
		con=JdbcUtil.getCon();
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, rpwd);
			pst.setInt(2, rid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
	}

	public Ro checkall(String rusername, String rpwd) {
		Ro ro = null;
		String sql="select * from ro where rusername=? and rpwd=?";
		con=JdbcUtil.getCon();
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1,rusername);
			pst.setString(2, rpwd);
			rs=pst.executeQuery();
			while(rs.next()){
				ro=new Ro();
				ro.setRusername(rs.getString(1));
				ro.setRpwd(rs.getString(2));
				ro.setRname(rs.getString(3));
				ro.setRid(rs.getInt(4));
				ro.setRsex(rs.getString(5));
				ro.setRage(rs.getInt(6));
				ro.setRemail(rs.getString(7));
				ro.setRmobileno(rs.getString(8));
				ro.setRcompany(rs.getString(9));
				ro.setRno(rs.getString(10));
				ro.setRperformance(rs.getInt(11));
				ro.setRteam(rs.getString(12));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
		
		return ro;
	}

	public boolean checkname(String rusername) {
		boolean flag = false;
		String sql = "select * from ro where rusername=?";
		con=JdbcUtil.getCon();
		try {
			pst= con.prepareStatement(sql);
			pst.setString(1,rusername);
			rs=pst.executeQuery();
			while(rs.next()){
				flag=true;
			}
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}

	public boolean checkpwd(String rpwd) {
		boolean flag = false;
		String sql = "select * from ro where rpwd=?";
		con=JdbcUtil.getCon();
		try {
			pst= con.prepareStatement(sql);
			pst.setString(1,rpwd);
			rs=pst.executeQuery();
			while(rs.next()){
				flag=true;
			}
			return flag;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}

	public List<Ro> showRo() {
		String sql="select * from ro";
		try {
			List<Ro> rlist=new ArrayList<Ro>();
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				Ro ro=new Ro();
				ro.setRusername(rs.getString(1));
				ro.setRpwd(rs.getString(2));
				ro.setRname(rs.getString(3));
				ro.setRid(rs.getInt(4));
				ro.setRsex(rs.getString(5));
				ro.setRage(rs.getInt(6));
				ro.setRemail(rs.getString(7));
				ro.setRmobileno(rs.getString(8));
				ro.setRcompany(rs.getString(9));
				ro.setRno(rs.getString(10));
				ro.setRperformance(rs.getInt(11));
				ro.setRteam(rs.getString(12));
				rlist.add(ro);
			}
			return rlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
		
	}

	public boolean deleteRoById(int rid) {
		String sql="delete from ro where rid=?";
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setInt(1, rid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
	}

	public boolean addRo(String rusername, String rpwd, String rname,
			String rsex, int rage, String remail, String rmobileno, String rno) {
		con=JdbcUtil.getCon();
		String sql="insert into ro(rusername, rpwd, rname, rsex, rage, remail, rmobileno, rcompany, rno, rperformance,rteam) values(?, ?, ?, ?, ?, ?, ?, 'fykj', ?, 0,'group')";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, rusername);
			pst.setString(2, rpwd);
			pst.setString(3, rname);
			pst.setString(4, rsex);
			pst.setInt(5, rage);
			pst.setString(6, remail);
			pst.setString(7, rmobileno);
			pst.setString(8, rno);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
	}

	public boolean UpdateRoById(int rid, String rusername, String rname,
			String rsex, int rage, String remail, String rmobileno,
			String rcompany, String rno, String rteam) {
		String sql="update ro set rusername=?, rname=?, rsex=?, rage=?, remail=?, rmobileno=?, rcompany=?, rno=?, rteam=? where rid=?";
		con=JdbcUtil.getCon();
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, rusername);
			pst.setString(2, rname);
			pst.setString(3, rsex);
			pst.setInt(4, rage);
			pst.setString(5, remail);
			pst.setString(6, rmobileno);
			pst.setString(7, rcompany);
			pst.setString(8, rno);
			pst.setString(9, rteam);
			pst.setInt(10, rid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		
		return false;
	}

	public List<Ro> selectRoByTeam(String rteam) {
		String sql="select * from ro where rteam=?";
		List<Ro> rlist=new ArrayList<Ro>();
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, rteam);
			rs=pst.executeQuery();
			while(rs.next()){
				Ro ro=new Ro();
				ro.setRusername(rs.getString(1));
				ro.setRpwd(rs.getString(2));
				ro.setRname(rs.getString(3));
				ro.setRid(rs.getInt(4));
				ro.setRsex(rs.getString(5));
				ro.setRage(rs.getInt(6));
				ro.setRemail(rs.getString(7));
				ro.setRmobileno(rs.getString(8));
				ro.setRcompany(rs.getString(9));
				ro.setRno(rs.getString(10));
				ro.setRperformance(rs.getInt(11));
				ro.setRteam(rs.getString(12));
				rlist.add(ro);
			}
			return rlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
	}

	public boolean updatePer(String rteam,int rperformance) {
		String sql="update ro set rperformance=? where rteam=?";
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setInt(1, rperformance);
			pst.setString(2, rteam);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
		
	}


}
