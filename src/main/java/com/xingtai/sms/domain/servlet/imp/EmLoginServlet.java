package com.xingtai.sms.domain.servlet.imp;

import com.xingtai.sms.domain.entity.Employee;
import com.xingtai.sms.domain.service.EmployeeService;
import com.xingtai.sms.domain.service.imp.EmployeeServiceImp;
import com.xingtai.sms.domain.entity.Employee;
import com.xingtai.sms.domain.service.EmployeeService;
import com.xingtai.sms.domain.service.imp.EmployeeServiceImp;

import java.io.IOException;
import java.io.PrintWriter;

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
public class EmLoginServlet extends HttpServlet {


	public EmLoginServlet() {
		super();
	}

	
	public void destroy() {
		super.destroy(); 
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		EmployeeService emp=new EmployeeServiceImp();
		Employee em=new Employee();
		String eusername=request.getParameter("eusername");
		String epwd=request.getParameter("epwd");
		em=emp.checkall(eusername, epwd); 
		
		
		if(em!=null){
			int eid=em.getEid();
			request.getSession().setAttribute("eid", eid);
			String epwd1=em.getEpwd();
			request.getSession().setAttribute("epwd1", epwd1);
			String team=em.getEteam();
			request.getSession().setAttribute("team", team);
			request.getSession().setAttribute("employee", em);
			response.sendRedirect(request.getContextPath()+"/Staff.jsp");
			
		}else{
			 response.sendRedirect(request.getContextPath()+"/fail.jsp");
		}
		response.setContentType("text/html,charset=UTF-8");

		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
