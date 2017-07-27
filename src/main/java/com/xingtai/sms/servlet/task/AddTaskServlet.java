package com.xingtai.sms.servlet.task;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xingtai.sms.service.TaskService;
import com.xingtai.sms.service.imp.TaskServiceImp;


public class AddTaskServlet extends HttpServlet {


	public AddTaskServlet() {
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
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html,charset=utf-8");
		TaskService tt=new TaskServiceImp();
		String team=(String)request.getSession().getAttribute("rteam");
		String task=request.getParameter("task");
		String rname=(String)request.getSession().getAttribute("rname");
		tt.addTask(task, team, rname);
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY><script type='text/javascript'>");
		out.println("window.open('Reporter.jsp','_parent')");
		out.println("  </script></BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}


	public void init() throws ServletException {
		// Put your code here
	}

}
