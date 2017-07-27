package com.jsdtkj.sms.servlet.imp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.service.imp.RoServiceImp;
import com.jsdtkj.sms.entity.Ro;
import com.jsdtkj.sms.service.RoService;

public class RoLoginServlet extends HttpServlet {

    public RoLoginServlet() {
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
        RoService ros = new RoServiceImp();
        Ro ro = new Ro();
        String rusername = request.getParameter("eusername");
        String rpwd = request.getParameter("epwd");
        ro = ros.checkall(rusername, rpwd);
        if (ro != null) {
            int rid = ro.getRid();
            request.getSession().setAttribute("rid", rid);
            String rpwd1 = ro.getRpwd();
            request.getSession().setAttribute("rpwd1", rpwd1);
            String rteam = ro.getRteam();
            request.getSession().setAttribute("rteam", rteam);
            String rname = ro.getRname();
            request.getSession().setAttribute("rname", rname);
            request.getSession().setAttribute("ro", ro);
            response.sendRedirect(request.getContextPath() + "/Reporter.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/fail.jsp");
        }

    }


    public void init() throws ServletException {
        // Put your code here
    }

}
