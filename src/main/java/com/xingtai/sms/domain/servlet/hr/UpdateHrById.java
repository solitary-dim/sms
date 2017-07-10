package com.xingtai.sms.domain.servlet.hr;

import com.xingtai.sms.domain.service.HrService;
import com.xingtai.sms.domain.service.imp.HrServiceImp;
import com.xingtai.sms.domain.service.HrService;
import com.xingtai.sms.domain.service.imp.HrServiceImp;

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
public class UpdateHrById extends HttpServlet {

	
	public UpdateHrById() {
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
		HrService hr=new HrServiceImp();
		int hid=Integer.parseInt(String.valueOf(request.getSession().getAttribute("hid")));
		String husername=request.getParameter("username");
		String hmobileno=request.getParameter("mobileno");
		String hemail=request.getParameter("e_mail");
		hr.updateHrById(hid, husername, hmobileno, hemail);
		response.sendRedirect(request.getContextPath()+"/ShowHrServlet");
		response.setContentType("text/html,CHARSSET=UTF-8");
		PrintWriter out = response.getWriter();
	}

	public void init() throws ServletException {
		// Put your code here
	}

}