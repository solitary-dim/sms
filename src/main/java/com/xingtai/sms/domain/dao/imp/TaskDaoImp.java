package com.xingtai.sms.domain.dao.imp;

import com.xingtai.sms.domain.dao.TaskDao;
import com.xingtai.sms.domain.entity.Task;
import com.xingtai.sms.domain.jdbc.JdbcUtil;
import com.xingtai.sms.domain.dao.TaskDao;
import com.xingtai.sms.domain.entity.Task;
import com.xingtai.sms.domain.jdbc.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class TaskDaoImp implements TaskDao {
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	public boolean addTask(String task,String team,String publisher) {
		String sql="insert into task (task,team,publisher) values(?,?,?)";
		try {
			con= JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, task);
			pst.setString(2, team);
			pst.setString(3, publisher);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
		return false;
	}

	public List<Task> selectTask(String team) {
		String sql="select * from task where team=?";
	
		List<Task> l=new ArrayList<Task>();
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, team);
			rs=pst.executeQuery();
			while(rs.next()){
				Task t=new Task();
				t.setTask(rs.getString(1));
				t.setTid(rs.getInt(2));
				t.setTeam(rs.getString(3));
				t.setPublisher(rs.getString(4));
				l.add(t);
			}
			return l;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
	}

}
