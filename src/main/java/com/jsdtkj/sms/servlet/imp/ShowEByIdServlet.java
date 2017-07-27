package com.jsdtkj.sms.servlet.imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.entity.Employee;
import com.jsdtkj.sms.service.EmployeeService;
import com.jsdtkj.sms.service.imp.EmployeeServiceImp;

public class ShowEByIdServlet extends HttpServlet {


    public ShowEByIdServlet() {
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
        response.setContentType("text/html,charset=utf-8");
        EmployeeService emp = new EmployeeServiceImp();
        int eid = Integer.parseInt(String.valueOf(request.getSession().getAttribute("eid")));
        Employee em = new Employee();
        em = emp.selectEmployeeById(eid);
        request.getSession().setAttribute("em", em);
        response.sendRedirect(request.getContextPath() + "/Staff/xggrxx.jsp");

        PrintWriter out = response.getWriter();

    }

    public void init() throws ServletException {
        // Put your code here
    }

}
