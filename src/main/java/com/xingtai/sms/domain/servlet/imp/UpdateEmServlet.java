package com.xingtai.sms.domain.servlet.imp;

import com.xingtai.sms.domain.service.EmployeeService;
import com.xingtai.sms.domain.service.imp.EmployeeServiceImp;
import com.xingtai.sms.domain.service.EmployeeService;
import com.xingtai.sms.domain.service.imp.EmployeeServiceImp;

import java.io.IOException;

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
public class UpdateEmServlet extends HttpServlet {

	public UpdateEmServlet() {
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
		response.setContentType("text/html,charset=utf-8");
		EmployeeService emp=new EmployeeServiceImp();
		int eid=Integer.parseInt(String.valueOf(request.getSession().getAttribute("eid")));
		String eusername=request.getParameter("eusername");
		String emobileno=request.getParameter("emobileno");
		String eemail=request.getParameter("eemail");
		String eskills=request.getParameter("eskills");
		emp.updateEmployeeById(eid, eusername, emobileno, eemail, eskills);
		response.sendRedirect(request.getContextPath()+"/ShowEmByIdServlet");
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
