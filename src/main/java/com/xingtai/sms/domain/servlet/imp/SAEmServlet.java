package com.xingtai.sms.domain.servlet.imp;

import com.xingtai.sms.domain.entity.Employee;
import com.xingtai.sms.domain.service.EmployeeService;
import com.xingtai.sms.domain.service.imp.EmployeeServiceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
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
