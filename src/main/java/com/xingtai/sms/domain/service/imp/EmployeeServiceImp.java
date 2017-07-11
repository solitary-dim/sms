package com.xingtai.sms.domain.service.imp;

import com.xingtai.sms.domain.dao.EmployeeDao;
import com.xingtai.sms.domain.dao.imp.EmployeeDaoImp;
import com.xingtai.sms.domain.entity.Employee;
import com.xingtai.sms.domain.service.EmployeeService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class EmployeeServiceImp implements EmployeeService {
	EmployeeDao em =new EmployeeDaoImp();

	//查询所有信息，用来怕岸段登录
	public Employee checkall(String eusername, String epwd) {
		return em.checkall(eusername, epwd);
	}

	//判断登录密码是否正确
	public boolean checkname(String eusername) {
		return em.checkname(eusername);
	}

	//用于判断登录用户名是否正确
	public boolean checkpwd(String epwd) {
		return em.checkpwd(epwd);
	}

	//查询所有员工信息，员工模块未能用到
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return em.showEmployee();
	}

	//通过ID查询员工信息，员工查看自己信息时用到
	public Employee selectEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return em.selectEmployeeById(eid);
	}

	//通过ID修改信息
	public boolean updateEmployeeById(int eid, String eusername,
			String emobileno, String eemail, String eskills) {
		// TODO Auto-generated method stub
		return em.updateEmployeeById(eid, eusername, emobileno, eemail, eskills);
	}

	public boolean updateEmployeeById(int eid, String epwd) {
		// TODO Auto-generated method stub
		return em.updateEmployeeById(eid, epwd);
	}
	
	public boolean updateEmployeeById(int eid, String ename, String eusername,
			String esex, int eage, String eskills, String eemail,
			String eno, String emobileno, String eteam){
		return em.updateEmployeeById(eid, ename, eusername, esex, eage, eskills, eemail, eno, emobileno, eteam);
		
	}
	
	public boolean addEmployee(String ename, String eusername,
			String esex, int eage, String eskills, String eemail,
			String eno, String emobileno, String eteam){
		return em.addEmployee(ename, eusername, esex, eage, eskills, eemail, eno, emobileno, eteam);
		
	}
	
	public boolean deleteEmployeeById(int eid){
		return em.deleteEmployeeById(eid);
	}

	public List<Employee> selectEmployeeById(String eteam) {
		return em.selectEmployeeById(eteam);
	}

	public boolean editp(int eid, int performance) {
		return em.editp(eid, performance);
	}

	public boolean editrp(int eid, int rper) {
		return em.editrp(eid, rper);
	}

	public int rperAvg(String eteam) {
		// TODO Auto-generated method stub
		return em.rperAvg(eteam);
	}

}
