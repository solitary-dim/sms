package com.jsdtkj.sms.entity;

public class Employee {
    private int eid;
    private String ename;
    private String eusername;
    private String epwd;
    private String esex;
    private int eage;
    private String eskills;
    private String eemail;
    private String eno;
    private String emobileno;
    private String eteam;
    private int performance;
    private int rper;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEusername() {
        return eusername;
    }

    public void setEusername(String eusername) {
        this.eusername = eusername;
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEskills() {
        return eskills;
    }

    public void setEskills(String eskills) {
        this.eskills = eskills;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEmobileno() {
        return emobileno;
    }

    public void setEmobileno(String emobileno) {
        this.emobileno = emobileno;
    }

    public String getEteam() {
        return eteam;
    }

    public void setEteam(String eteam) {
        this.eteam = eteam;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }


    public int getRper() {
        return rper;
    }

    public void setRper(int rper) {
        this.rper = rper;
    }

    public Employee(int eid, String ename, String eusername, String epwd,
                    String esex, int eage, String eskills, String eemail, String eno,
                    String emobileno, String eteam, int performance, int rper) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.eusername = eusername;
        this.epwd = epwd;
        this.esex = esex;
        this.eage = eage;
        this.eskills = eskills;
        this.eemail = eemail;
        this.eno = eno;
        this.emobileno = emobileno;
        this.eteam = eteam;
        this.performance = performance;
        this.rper = rper;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee [eage=" + eage + ", eemail=" + eemail + ", eid=" + eid
                + ", emobileno=" + emobileno + ", ename=" + ename + ", eno="
                + eno + ", epwd=" + epwd + ", esex=" + esex + ", eskills="
                + eskills + ", eteam=" + eteam + ", eusername=" + eusername
                + ", performance=" + performance + ", rper=" + rper
                + ", getEage()=" + getEage() + ", getEemail()=" + getEemail()
                + ", getEid()=" + getEid() + ", getEmobileno()="
                + getEmobileno() + ", getEname()=" + getEname() + ", getEno()="
                + getEno() + ", getEpwd()=" + getEpwd() + ", getEsex()="
                + getEsex() + ", getEskills()=" + getEskills()
                + ", getEteam()=" + getEteam() + ", getEusername()="
                + getEusername() + ", getPerformance()=" + getPerformance()
                + ", getRper()=" + getRper() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }


}
