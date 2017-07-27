package com.jsdtkj.sms.servlet.imp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.service.imp.RoServiceImp;
import com.jsdtkj.sms.entity.Ro;
import com.jsdtkj.sms.service.RoService;

public class ShowRoServlet extends HttpServlet {

    public ShowRoServlet() {
        super();
    }

    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        int sel = 1;
        sel = Integer.parseInt(request.getParameter("sel"));
        RoService ros = new RoServiceImp();
        List<Ro> rlist = new ArrayList<Ro>();
        rlist = ros.showRo();
        request.getSession().setAttribute("rlist", rlist);
        if (sel == 1) {
            response.sendRedirect(request.getContextPath() + "/Reporter/grxx.jsp");
        } else if (sel == 11) {
            response.sendRedirect(request.getContextPath() + "/HR/ckjgxx.jsp");
        } else if (sel == 12) {
            response.sendRedirect(request.getContextPath() + "/HR/jgxxxq.jsp");
        } else if (sel == 19) {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
            out.println("  <BODY><script type='text/javascript'>");
            out.println("window.open('HR/ckjgxx.jsp','_parent')");
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
