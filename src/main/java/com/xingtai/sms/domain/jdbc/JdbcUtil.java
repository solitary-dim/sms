package com.xingtai.sms.domain.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class JdbcUtil {
	
	private static Properties pro;
	static{
		pro = new Properties();
		try{
			pro.load(JdbcUtil.class.
					getClassLoader().
					getResourceAsStream("sysconfig.properties"));
			String driverClassName = pro.getProperty("driverClassName");
			Class.forName(driverClassName);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		Connection con=null;
		String url=pro.getProperty("url");
		try{
			con=DriverManager.getConnection(url, pro);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void release(Connection con, Statement stmt, ResultSet rs){
		
			try {
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(con!=null){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void release(Connection con, Statement stmt){
			try {
				if(stmt!=null){
				stmt.close();
				}
				if(con!=null){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
