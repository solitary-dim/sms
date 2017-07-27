package com.jsdtkj.sms.servlet.hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.entity.Hr;
import com.jsdtkj.sms.service.HrService;
import com.jsdtkj.sms.service.imp.HrServiceImp;

public class ShowHServlet extends HttpServlet {


    public ShowHServlet() {
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
        HrService hr = new HrServiceImp();
        Hr h = new Hr();
        int hid = Integer.parseInt(String.valueOf(request.getSession().getAttribute("hid")));
        h = hr.selectHrById(hid);
        request.getSession().setAttribute("hr", h);
        response.sendRedirect(request.getContextPath() + "/HR/xggrxx.jsp");
        PrintWriter out = response.getWriter();
    }


    public void init() throws ServletException {
        // Put your code here
    }

}
