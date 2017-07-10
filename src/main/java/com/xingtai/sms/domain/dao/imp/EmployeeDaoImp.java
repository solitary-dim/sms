package com.xingtai.sms.domain.dao.imp;

import com.xingtai.sms.domain.dao.EmployeeDao;
import com.xingtai.sms.domain.entity.Employee;
import com.xingtai.sms.domain.jdbc.JdbcUtil;
import com.xingtai.sms.domain.dao.EmployeeDao;
import com.xingtai.sms.domain.entity.Employee;
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
public class EmployeeDaoImp implements EmployeeDao {
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;

	public boolean checkname(String eusername) {
		boolean flag=false;
		String sql="select * from employee where eusername=?";
		try {
			con= JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, eusername);
			rs=pst.executeQuery();
			if(rs.next()){
				flag=true;
			}
			return flag;
		} catch (SQLException e) {
			e.printStackTrace();
			flag=false;
		}		
		return flag;
	}
	

	public boolean checkpwd(String epwd) {
		boolean flag=false;
		String sql="select * from employee where epwd=?";
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, epwd);
			rs=pst.executeQuery();
			if(rs.next()){
				flag=true;
			}
			return flag;
		} catch (SQLException e) {
			e.printStackTrace();
			flag=false;
		}		
		return flag;
	}

	public Employee checkall(String eusername, String epwd) {
		Employee em=null;
		if(checkname(eusername) && checkpwd(epwd)){
			String sql="select * from employee where eusername=? and epwd=?";
			try {
				con=JdbcUtil.getCon();
				pst=con.prepareStatement(sql);
				pst.setString(1, eusername);
				pst.setString(2, epwd);
				rs=pst.executeQuery();
				if(rs.next()){
					em=new Employee();
					em.setEid(rs.getInt(1));
					em.setEname(rs.getString(2));
					em.setEusername(rs.getString(3));
					em.setEpwd(rs.getString(4));
					em.setEsex(rs.getString(5));
					em.setEage(rs.getInt(6));
					em.setEskills(rs.getString(7));
					em.setEemail(rs.getString(8));
					em.setEno(rs.getString(9));
					em.setEmobileno(rs.getString(10));
					em.setEteam(rs.getString(11));
					em.setPerformance(rs.getInt(12));	
				}			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				JdbcUtil.release(con, pst, rs);
			}
		}
		return em;
	}


	public List<Employee> showEmployee() {
		String sql="select * from employee";
		try {
			List<Employee> elist=new ArrayList<Employee>();
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while (rs.next()){
				Employee em=new Employee();
				em.setEid(rs.getInt(1));
				em.setEname(rs.getString(2));
				em.setEusername(rs.getString(3));
				em.setEpwd(rs.getString(4));
				em.setEsex(rs.getString(5));
				em.setEage(rs.getInt(6));
				em.setEskills(rs.getString(7));
				em.setEemail(rs.getString(8));
				em.setEno(rs.getString(9));
				em.setEmobileno(rs.getString(10));
				em.setEteam(rs.getString(11));
				em.setPerformance(rs.getInt(12));	
				elist.add(em);		
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}		
	}


	public Employee selectEmployeeById(int eid) {
		String sql="select * from employee where eid=?";		
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setInt(1, eid);
			rs=pst.executeQuery();
			Employee em=new Employee();
			while(rs.next()){
				em.setEid(rs.getInt(1));
				em.setEname(rs.getString(2));
				em.setEusername(rs.getString(3));
				em.setEpwd(rs.getString(4));
				em.setEsex(rs.getString(5));
				em.setEage(rs.getInt(6));
				em.setEskills(rs.getString(7));
				em.setEemail(rs.getString(8));
				em.setEno(rs.getString(9));
				em.setEmobileno(rs.getString(10));
				em.setEteam(rs.getString(11));
				em.setPerformance(rs.getInt(12));
			}
			return em;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
		
	}


	public boolean updateEmployeeById(int eid, String eusername,
			String emobileno, String eemail, String eskills) {
			String sql="update employee set eusername=?," +
					"emobileno=?,eemail=?,eskills=? where eid=?";			
			try {
				con=JdbcUtil.getCon();
				pst=con.prepareStatement(sql);
				pst.setString(1,eusername);
				pst.setString(2, emobileno);
				pst.setString(3, eemail);
				pst.setString(4, eskills);
				pst.setInt(5, eid);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				JdbcUtil.release(con, pst);
			}
			
			
		return false;
	}


	public boolean updateEmployeeById(int eid, String epwd) {
		String sql="update employee set epwd=? where eid=?";		
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, epwd);
			pst.setInt(2, eid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
	}
	
	public boolean updateEmployeeById(int eid, String ename, String eusername,
			String esex, int eage, String eskills, String eemail,
			String eno, String emobileno, String eteam){
		String sql="update em" +
				"ployee set ename=?, eusername=?, esex=?, eage=?, eskills=?, eemail=?, eno=?, emobileno=?, eteam=? where eid=?";			
		con=JdbcUtil.getCon();
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1,ename);
			pst.setString(2, eusername);
			pst.setString(3, esex);
			pst.setInt(4, eage);
			pst.setString(5, eskills);
			pst.setString(6, eemail);
			pst.setString(7, eno);
			pst.setString(8, emobileno);
			pst.setString(9, eteam);
			pst.setInt(10, eid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
	}
	
	public boolean addEmployee(String ename, String eusername,
			String esex, int eage, String eskills, String eemail,
			String eno, String emobileno, String eteam){
		con=JdbcUtil.getCon();
//		int eid=0;
//		try {
//			String sqll="select eid from employee where eid=(select max(eid) from employee)";
//			pst=con.prepareStatement(sqll);
//			rs=pst.executeQuery();
//			System.out.println(rs.next());
//			while(rs.next()){
//				rs.getInt("eid");
//				//eid=Integer.parseInt(rs.getString("eid"));
//				eid+=1;
//			}
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		String sqll="select eno from employee";
		try {
			pst=con.prepareStatement(sqll);
			rs=pst.executeQuery();
			while(rs.next()){
				if(eno==rs.getString(1)){
					return false;
				}else{
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql="insert into employee(ename,eusername,epwd,esex,eage,eskills,eemail,eno,emobileno,eteam,performance,rper) values(?, ?, 111111, ?, ?, ?, ?, ?, ?, ?, 0, 0)";			
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1,ename);
			pst.setString(2, eusername);
			pst.setString(3, esex);
			pst.setInt(4, eage);
			pst.setString(5, eskills);
			pst.setString(6, eemail);
			pst.setString(7, eno); 
			pst.setString(8, emobileno);
			pst.setString(9, eteam);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
		return false;
	}
	
	public boolean deleteEmployeeById(int eid){
		String sql="delete from employee where eid=?";		
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setInt(1, eid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtil.release(con, pst);
		}
		return false;
	}


	public List<Employee> selectEmployeeById(String eteam) {
		String sql="select * from employee where eteam=?";	
		List<Employee> list=new ArrayList<Employee>();
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, eteam);
			rs=pst.executeQuery();
			
			
			while(rs.next()){
				Employee em=new Employee();
				em.setEid(rs.getInt(1));
				em.setEname(rs.getString(2));
				em.setEusername(rs.getString(3));
				em.setEpwd(rs.getString(4));
				em.setEsex(rs.getString(5));
				em.setEage(rs.getInt(6));
				em.setEskills(rs.getString(7));
				em.setEemail(rs.getString(8));
				em.setEno(rs.getString(9));
				em.setEmobileno(rs.getString(10));
				em.setEteam(rs.getString(11));
				em.setPerformance(rs.getInt(12));
				list.add(em);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}
	}


	public boolean editp(int eid, int performance) {
			String sql="update employee set performance=? where eid=?";			
			try {
				con=JdbcUtil.getCon();
				pst=con.prepareStatement(sql);
				pst.setInt(1, performance);
				pst.setInt(2, eid);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				JdbcUtil.release(con, pst);
			}
			
			
		return false;
	}


	public int rperAvg(String eteam) {
		String sql="select avg(rper) as rper from employee where eteam=?";
		int rperformance=0;
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setString(1, eteam);
			rs=pst.executeQuery();
			while(rs.next()){
				rperformance=rs.getInt(1);
			}
			return rperformance;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}finally{
			JdbcUtil.release(con, pst, rs);
		}	
	}


	public boolean editrp(int eid, int rper) {
		String sql="update employee set rper=? where eid=?";			
		try {
			con=JdbcUtil.getCon();
			pst=con.prepareStatement(sql);
			pst.setInt(1, rper);
			pst.setInt(2, eid);
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

