package com.xingtai.sms.servlet.hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xingtai.sms.entity.Hr;
import com.xingtai.sms.service.HrService;
import com.xingtai.sms.service.imp.HrServiceImp;

public class ShowHrServlet extends HttpServlet {


	public ShowHrServlet() {
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
		HrService hr =new HrServiceImp();
		Hr h =new Hr();
		int hid=Integer.parseInt(String.valueOf(request.getSession().getAttribute("hid")));
		h=hr.selectHrById(hid);
		request.getSession().setAttribute("hr", h);
		response.sendRedirect(request.getContextPath()+"/HR/grxx.jsp");

		response.setContentType("text/html,charset=utf-8");
		PrintWriter out = response.getWriter();
	}


	public void init() throws ServletException {
		// Put your code here
	}

}
