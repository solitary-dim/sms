package com.xingtai.sms.domain.service;

import com.xingtai.sms.domain.entity.Employee;
import com.xingtai.sms.domain.entity.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface EmployeeService {
	public boolean checkname(String eusername);
	public boolean checkpwd(String epwd);
	public Employee checkall(String eusername, String epwd);
	public List<Employee> showEmployee();
	public Employee selectEmployeeById(int eid);
	public boolean updateEmployeeById(int eid, String eusername,
									  String emobileno, String eemail, String eskills);
	public boolean updateEmployeeById(int eid, String epwd);
	public boolean updateEmployeeById(int eid, String ename, String eusername,
									  String esex, int eage, String eskills, String eemail,
									  String eno, String emobileno, String eteam);
	public boolean addEmployee(String ename, String eusername,
							   String esex, int eage, String eskills, String eemail,
							   String eno, String emobileno, String eteam);
	public boolean deleteEmployeeById(int eid);
	public List<Employee> selectEmployeeById(String eteam);
	public boolean editp(int eid, int performance);
	public boolean editrp(int eid, int rper);
	public int rperAvg(String eteam);
}