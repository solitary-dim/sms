package com.jsdtkj.sms.servlet.imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsdtkj.sms.entity.Employee;
import com.jsdtkj.sms.service.EmployeeService;
import com.jsdtkj.sms.service.RoService;
import com.jsdtkj.sms.service.imp.EmployeeServiceImp;
import com.jsdtkj.sms.service.imp.RoServiceImp;
import com.jsdtkj.sms.entity.Ro;

public class UpdateEmServlet2 extends HttpServlet {

    public UpdateEmServlet2() {
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
        RoService r = new RoServiceImp();
        int eid = 0;
        int sel = Integer.parseInt(request.getParameter("sel"));
        if (sel == 7) {
            eid = Integer.parseInt(request.getParameter("eid"));
            request.getSession().setAttribute("eid", eid);
            String eusername = request.getParameter("eusername");
            String ename = request.getParameter("ename");
            int eage = Integer.parseInt(request.getParameter("eage"));
            String esex = request.getParameter("esex");
            String eno = request.getParameter("eno");
            String emobileno = request.getParameter("emobileno");
            String eemail = request.getParameter("eemail");
            String eskills = request.getParameter("eskills");
            String eteam = request.getParameter("eteam");
            emp.updateEmployeeById(eid, ename, eusername, esex, eage, eskills, eemail, eno, emobileno, eteam);
            response.sendRedirect(request.getContextPath() + "/ShowEmByIdServlet");
        } else if (sel == 8) {
            String eusername = request.getParameter("eusername");
            String ename = request.getParameter("ename");
            int eage = Integer.parseInt(request.getParameter("eage"));
            String esex = request.getParameter("esex");
            String eno = request.getParameter("eno");
            String emobileno = request.getParameter("emobileno");
            String eemail = request.getParameter("eemail");
            String eskills = request.getParameter("eskills");
            String eteam = request.getParameter("eteam");
            emp.addEmployee(ename, eusername, esex, eage, eskills, eemail, eno, emobileno, eteam);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
            out.println("  <BODY><script type='text/javascript'>");
            out.println("window.open('Reporter/ckygxx.jsp','_parent')");
            out.println("  </script></BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();
            //response.sendRedirect(request.getContextPath()+"/Reporter/ckygxx.jsp");
        } else if (sel == 13) {
            eid = Integer.parseInt(request.getParameter("eid"));
            emp.deleteEmployeeById(eid);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
            out.println("  <BODY><script type='text/javascript'>");
            out.println("alert('Successfully!')");
            out.println("window.open('Reporter.jsp','_top')");
            //out.println("window.onload=ygxx()");
            out.println("  </script></BODY>");
            out.println("</HTML>");
            out.flush();
            out.close();
        } else if (sel == 18) {
            int rid = Integer.parseInt(request.getParameter("rid"));
            Ro ro = new Ro();
            RoService ros = new RoServiceImp();
            ro = ros.selectRoById(rid);
            String ename = ro.getRname();
            String eusername = ro.getRusername();
            String esex = ro.getRsex();
            int eage = ro.getRage();
            String eskills = "java";
            String eemail = ro.getRemail();
            String eno = ro.getRno();
            String emobileno = ro.getRmobileno();
            String eteam = "group";
            emp.addEmployee(ename, eusername, esex, eage, eskills, eemail, eno, emobileno, eteam);
            ros.deleteRoById(rid);
            response.sendRedirect(request.getContextPath() + "/ShowRoServlet?sel=19");
        } else if (sel == 20) {
            eid = Integer.parseInt(request.getParameter("eid"));
            Employee employee = new Employee();
            employee = emp.selectEmployeeById(eid);
            String rusername = employee.getEusername();
            String rpwd = employee.getEpwd();
            String rname = employee.getEname();
            String rsex = employee.getEsex();
            int rage = employee.getEage();
            String remail = employee.getEemail();
            String rmobileno = employee.getEmobileno();
            String rno = employee.getEno();
            RoService ros = new RoServiceImp();
            ros.addRo(rusername, rpwd, rname, rsex, rage, remail, rmobileno, rno);
            emp.deleteEmployeeById(eid);
            response.sendRedirect(request.getContextPath() + "/ShowEmServlet?sel=21");
        } else if (sel == 26) {
            eid = Integer.parseInt(request.getParameter("eid"));
            int performance = Integer.parseInt(request.getParameter("performance"));
            emp.editp(eid, performance);
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("<script type='text/javascript'>");
            out.println("window.open('Reporter/yjpg1.jsp','_self')");
            out.println("  </script></HTML>");
            out.flush();
            out.close();
        } else if (sel == 30) {
            eid = Integer.parseInt(String.valueOf(request.getSession().getAttribute("eid")));
            int rper = Integer.parseInt(request.getParameter("rper"));
            emp.editrp(eid, rper);
            String rteam = request.getParameter("te");
            String eteam = rteam;
            int rperformance = emp.rperAvg(eteam);
            r.updatePer(rteam, rperformance);
            //response.sendRedirect(request.getContextPath()+"/");


            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
            out.println("<HTML>");
            out.println("  <HEAD><meta http-equiv='content-type' content='text/html; charset=UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
            out.println("  <BODY><script type='text/javascript'>");
            out.println("window.open('Staff.jsp','_parent')");
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
