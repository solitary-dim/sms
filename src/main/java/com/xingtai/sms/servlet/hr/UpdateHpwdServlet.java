package com.xingtai.sms.servlet.hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xingtai.sms.service.HrService;
import com.xingtai.sms.service.imp.HrServiceImp;

public class UpdateHpwdServlet extends HttpServlet {

	
	public UpdateHpwdServlet() {
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
		HrService hr=new HrServiceImp();
		int hid =Integer.parseInt(String.valueOf(request.getSession().getAttribute("hid")));
		String hpwd=request.getParameter("newpwd");
		hr.updateHrById(hid, hpwd);
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
