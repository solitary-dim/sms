package com.jsdtkj.sms.servlet.imp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.entity.Employee;
import com.jsdtkj.sms.service.EmployeeService;
import com.jsdtkj.sms.service.imp.EmployeeServiceImp;

public class ShowEmByIdServlet2 extends HttpServlet {


    public ShowEmByIdServlet2() {
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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html,charset=utf-8");
        List<Employee> elist1 = new ArrayList<Employee>();
        EmployeeService emp = new EmployeeServiceImp();
        int eid = 0;
        int sel = Integer.parseInt(request.getParameter("sel"));
        if (sel == 4 || sel == 6 || sel == 16) {
            eid = Integer.parseInt(request.getParameter("sele"));
        } else if (sel == 5 || sel == 10 || sel == 14) {
            eid = Integer.parseInt(request.getParameter("eid"));
        } else if (sel == 25) {
            eid = 0;
        }
        Employee em = new Employee();
        em = emp.selectEmployeeById(eid);
        request.getSession().setAttribute("employee", em);
        if (sel == 4) {
            response.sendRedirect(request.getContextPath() + "/Reporter/xgygxx.jsp");
        } else if (sel == 5) {
            response.sendRedirect(request.getContextPath() + "/Reporter/ygxxxq.jsp");
        } else if (sel == 6) {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
            out.println("  <BODY><script type='text/javascript'>");
            out.println("window.location.href='Reporter/ygxxxq.jsp'");
            out.println("  </script></BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();
            //response.sendRedirect(request.getContextPath()+"/Reporter/ygxxxq.jsp");
        } else if (sel == 10 || sel == 14 || sel == 16) {
            response.sendRedirect(request.getContextPath() + "/HR/ygxxxq.jsp");
        } else if (sel == 25) {
            String eteam = (String) request.getSession().getAttribute("rteam");
            elist1 = emp.selectEmployeeById(eteam);
            request.getSession().setAttribute("elist1", elist1);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
            out.println("  <BODY><script type='text/javascript'>");
            out.println("window.location.href='Reporter/yjpg1.jsp'");
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
