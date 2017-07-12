package com.xingtai.sms.domain.service;

import com.xingtai.sms.domain.entity.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface EmployeeService {
	boolean checkname(String eusername);
	boolean checkpwd(String epwd);
	Employee checkall(String eusername, String epwd);
	List<Employee> showEmployee();
	Employee selectEmployeeById(int eid);
	boolean updateEmployeeById(int eid, String eusername,
									  String emobileno, String eemail, String eskills);
	boolean updateEmployeeById(int eid, String epwd);
	boolean updateEmployeeById(int eid, String ename, String eusername,
									  String esex, int eage, String eskills, String eemail,
									  String eno, String emobileno, String eteam);
	boolean addEmployee(String ename, String eusername,
							   String esex, int eage, String eskills, String eemail,
							   String eno, String emobileno, String eteam);
	boolean deleteEmployeeById(int eid);
	List<Employee> selectEmployeeById(String eteam);
	boolean editp(int eid, int performance);
	boolean editrp(int eid, int rper);
	int rperAvg(String eteam);
}