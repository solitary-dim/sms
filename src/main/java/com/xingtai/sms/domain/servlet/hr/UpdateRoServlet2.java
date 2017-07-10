package com.xingtai.sms.domain.servlet.hr;

import com.xingtai.sms.domain.service.RoService;
import com.xingtai.sms.domain.service.imp.RoServiceImp;
import com.xingtai.sms.domain.service.RoService;
import com.xingtai.sms.domain.service.imp.RoServiceImp;

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
public class UpdateRoServlet2 extends HttpServlet {

	public UpdateRoServlet2() {
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
		RoService ros=new RoServiceImp();
		int rid=0;
		int sel=Integer.parseInt(request.getParameter("sel"));
		if(sel==23){
			rid=Integer.parseInt(request.getParameter("rid"));
			String rusername=request.getParameter("rusername");
			String rname=request.getParameter("rname");
			int rage=Integer.parseInt(request.getParameter("rage"));
			String rsex=request.getParameter("rsex");
			String rno=request.getParameter("rno");
			String rmobileno=request.getParameter("rmobileno");
			String remail=request.getParameter("remail");
			String rteam=request.getParameter("rteam");
			String rcompany=request.getParameter("rcompany");
			ros.UpdateRoById(rid, rusername, rname, rsex, rage, remail, rmobileno, rcompany, rno, rteam);
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY><script type='text/javascript'>");
			out.println("window.open('HR/jgxxxq.jsp','_parent')");
			out.println("  </script></BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
