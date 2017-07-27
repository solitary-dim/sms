package com.jsdtkj.sms.servlet.imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.service.RoService;
import com.jsdtkj.sms.service.imp.RoServiceImp;

public class UpdateRpwdServlet extends HttpServlet {

    public UpdateRpwdServlet() {
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
        RoService ros = new RoServiceImp();
        int rid = Integer.parseInt(String.valueOf(request.getSession().getAttribute("rid")));
        String rpwd = request.getParameter("newpwd");
        ros.updateRoById(rid, rpwd);
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY><script type='text/javascript'>");
        out.println("window.open('index.jsp','_parent')");
        out.println("  </script></BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    public void init() throws ServletException {
        // Put your code here
    }

}
