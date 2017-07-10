package com.xingtai.sms.domain.servlet.hr;

import com.xingtai.sms.domain.entity.Ro;
import com.xingtai.sms.domain.service.RoService;
import com.xingtai.sms.domain.service.imp.RoServiceImp;
import com.xingtai.sms.domain.entity.Ro;
import com.xingtai.sms.domain.service.RoService;
import com.xingtai.sms.domain.service.imp.RoServiceImp;

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
public class ShowRoByIdServlet2 extends HttpServlet {

	public ShowRoByIdServlet2() {
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

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html,charset=utf-8");
		RoService ros=new RoServiceImp();
		int rid=0;
		int sel=Integer.parseInt(request.getParameter("sel"));
		if(sel==12){
			rid=Integer.parseInt(request.getParameter("sele"));
		}else if(sel==13 || sel==22 || sel==32){
			rid=Integer.parseInt(request.getParameter("rid"));
		}else if(sel==28){
			rid=0;
		}
		Ro ro = new Ro();
		ro=ros.selectRoById(rid);
		request.getSession().setAttribute("ro", ro);
		if(sel==12 || sel==13 ||sel==32){
			response.sendRedirect(request.getContextPath()+"/HR/jgxxxq.jsp");
		}else if(sel==22){
			response.sendRedirect(request.getContextPath()+"/HR/xgjgxx.jsp");
		}else if(sel==28){
			String eteam=(String)request.getSession().getAttribute("team");
			List<Ro> rlist=new ArrayList<Ro>();
			rlist=ros.selectRoByTeam(eteam);
			request.getSession().setAttribute("rlist", rlist);
			response.sendRedirect(request.getContextPath()+"/Staff/yjpg.jsp");
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
