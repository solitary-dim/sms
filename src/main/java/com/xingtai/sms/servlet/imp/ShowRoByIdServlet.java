package com.xingtai.sms.servlet.imp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xingtai.sms.entity.Ro;
import com.xingtai.sms.service.RoService;
import com.xingtai.sms.service.imp.RoServiceImp;

public class ShowRoByIdServlet extends HttpServlet {

	public ShowRoByIdServlet() {
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
		response.setContentType("text/html; charset=utf-8");
		RoService ros=new RoServiceImp();
		int rid=Integer.parseInt(String.valueOf(request.getSession().getAttribute("rid")));
		Ro ro=new Ro();
		ro=ros.selectRoById(rid);
		request.getSession().setAttribute("ro", ro);
		response.sendRedirect(request.getContextPath()+"/Reporter/grxx.jsp");

	}

	public void init() throws ServletException {
		// Put your code here
	}

}
