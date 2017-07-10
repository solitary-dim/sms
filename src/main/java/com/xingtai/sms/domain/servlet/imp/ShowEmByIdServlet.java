package com.xingtai.sms.domain.servlet.imp;

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
public class ShowEmByIdServlet extends HttpServlet {


	public ShowEmByIdServlet() {
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
		Employee em=new Employee();
		em=emp.selectEmployeeById(eid);
		request.getSession().setAttribute("em", em);
		response.sendRedirect(request.getContextPath()+"/Staff/grxx.jsp");
	
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
