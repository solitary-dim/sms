package com.xingtai.sms.domain.servlet.hr;

import com.xingtai.sms.domain.entity.Hr;
import com.xingtai.sms.domain.service.HrService;
import com.xingtai.sms.domain.service.imp.HrServiceImp;
import com.xingtai.sms.domain.entity.Hr;
import com.xingtai.sms.domain.service.HrService;
import com.xingtai.sms.domain.service.imp.HrServiceImp;

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
public class HrLoginServlet extends HttpServlet {

	public HrLoginServlet() {
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
		Hr h=new Hr();
		String husername=request.getParameter("eusername");
		String hpwd=request.getParameter("epwd");
		h=hr.checkall(husername, hpwd);
		if(h!=null){
			int hid=h.getHid();
			request.getSession().setAttribute("hid", hid);
			String hpwd1=h.getHpwd();
			request.getSession().setAttribute("hpwd", hpwd1);
			request.getSession().setAttribute("hr", h);
			response.sendRedirect(request.getContextPath()+"/HR.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/fail.jsp");
		}
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
