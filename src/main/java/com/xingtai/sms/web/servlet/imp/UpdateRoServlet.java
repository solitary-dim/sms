package com.xingtai.sms.web.servlet.imp;

import com.xingtai.sms.domain.service.RoService;
import com.xingtai.sms.domain.service.imp.RoServiceImp;

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
public class UpdateRoServlet extends HttpServlet {

	public UpdateRoServlet() {
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
		String rusername=request.getParameter("rusername");
		String rmobileno=request.getParameter("rmobileno");
		String remail=request.getParameter("remail");
		ros.updateRoById(rid, rusername, rmobileno, remail);
		response.sendRedirect(request.getContextPath()+"/ShowRoByIdServlet");
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
