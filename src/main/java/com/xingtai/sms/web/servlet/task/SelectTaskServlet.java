package com.xingtai.sms.web.servlet.task;

import com.xingtai.sms.domain.entity.Task;
import com.xingtai.sms.domain.service.TaskService;
import com.xingtai.sms.domain.service.imp.TaskServiceImp;

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
public class SelectTaskServlet extends HttpServlet {


	public SelectTaskServlet() {
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
		response.setCharacterEncoding("Utf-8");
		TaskService tt=new TaskServiceImp();
		String team=(String)request.getSession().getAttribute("team");
		List<Task> l=new ArrayList<Task>();
		l=tt.selectTask(team);
		request.getSession().setAttribute("list", l);
		response.sendRedirect(request.getContextPath()+"/Staff/ckrw.jsp");
		response.setContentType("text/html,charset=utf-8");
		PrintWriter out = response.getWriter();
	}


	public void init() throws ServletException {
		// Put your code here
	}

}
