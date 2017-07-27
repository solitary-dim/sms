package com.xingtai.sms.servlet.imp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xingtai.sms.entity.Employee;
import com.xingtai.sms.service.EmployeeService;
import com.xingtai.sms.service.imp.EmployeeServiceImp;

public class SAEmServlet extends HttpServlet {

	public SAEmServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		int sel=Integer.parseInt(request.getParameter("sel"));
		EmployeeService emp=new EmployeeServiceImp();
		List<Employee> elist=new ArrayList<Employee>();
		elist=emp.showEmployee();
		request.getSession().setAttribute("elist", elist);
		if(sel==1){
			response.sendRedirect(request.getContextPath()+"/Reporter/ygxx.jsp");
		}else if(sel==2){
			response.sendRedirect(request.getContextPath()+"/Reporter/xgygxx.jsp");
		}
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
