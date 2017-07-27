package com.xingtai.sms.servlet.imp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import com.xingtai.sms.entity.Employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xingtai.sms.service.EmployeeService;
import com.xingtai.sms.service.imp.EmployeeServiceImp;

public class ShowEmServlet extends HttpServlet {

	public ShowEmServlet() {
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
		int sel=1;
		sel=Integer.parseInt(request.getParameter("sel"));
		EmployeeService emp=new EmployeeServiceImp();
		List<Employee> elist=new ArrayList<Employee>();
//		List<Employee> elist1=new ArrayList<Employee>();
		elist=emp.showEmployee();
		request.getSession().setAttribute("elist", elist);
		if(sel==1){
			response.sendRedirect(request.getContextPath()+"/Staff/grxx.jsp");
		}else if(sel==2){
			response.sendRedirect(request.getContextPath()+"/Reporter/ckygxx.jsp");
		}else if(sel==3){
			response.sendRedirect(request.getContextPath()+"/Reporter/xgygxx.jsp");
		}else if(sel==9){
			response.sendRedirect(request.getContextPath()+"/HR/ckygxx.jsp");
		}else if(sel==21){
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY><script type='text/javascript'>");
			out.println("window.open('HR/ckygxx.jsp','_parent')");
			out.println("  </script></BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();}
//		else if(sel==24){
//			String eteam=(String)request.getSession().getAttribute("rteam");
//			elist1=emp.selectEmployeeById(eteam);
//			request.getSession().setAttribute("elist1", elist1);
//			response.sendRedirect(request.getContextPath()+"/Reporter/yjpg.jsp");
//		}
		
	}


	public void init() throws ServletException {
	}

}
