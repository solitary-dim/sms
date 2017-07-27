package com.jsdtkj.sms.dao;

import java.util.List;

import com.jsdtkj.sms.entity.Employee;

public interface EmployeeDao {
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
