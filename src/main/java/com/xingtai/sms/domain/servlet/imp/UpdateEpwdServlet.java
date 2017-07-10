package com.xingtai.sms.domain.servlet.imp;

import com.xingtai.sms.domain.service.EmployeeService;
import com.xingtai.sms.domain.service.imp.EmployeeServiceImp;
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
public class UpdateEpwdServlet extends HttpServlet {


	public UpdateEpwdServlet() {
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
		EmployeeService emp=new EmployeeServiceImp();
		int eid=Integer.parseInt(String.valueOf(request.getSession().getAttribute("eid")));
		String epwd=request.getParameter("newpwd");
		emp.updateEmployeeById(eid, epwd);
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY><script type='text/javascript'>");
		out.println("window.open('index.jsp','_parent')");
		out.println("  </script></BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
