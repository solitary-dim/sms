package com.xingtai.sms.entity;

public class Ro {
	
	String rusername;
	String rpwd;
	String rname;
	int rid;
	String rsex;
	int rage;
	String remail;
	String rmobileno;
	String rcompany;
	String rno;
	int rperformance;
	String rteam;
	public Ro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ro(String rusername, String rpwd, String rname, int rid,
			String rsex, int rage, String remail, String rmobileno,
			String rcompany, String rno, int rperformance, String rteam) {
		super();
		this.rusername = rusername;
		this.rpwd = rpwd;
		this.rname = rname;
		this.rid = rid;
		this.rsex = rsex;
		this.rage = rage;
		this.remail = remail;
		this.rmobileno = rmobileno;
		this.rcompany = rcompany;
		this.rno = rno;
		this.rperformance = rperformance;
		this.rteam = rteam;
	}

	public String getRusername() {
		return rusername;
	}

	public void setRusername(String rusername) {
		this.rusername = rusername;
	}

	public String getRpwd() {
		return rpwd;
	}

	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRsex() {
		return rsex;
	}

	public void setRsex(String rsex) {
		this.rsex = rsex;
	}

	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}

	public String getRemail() {
		return remail;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}

	public String getRmobileno() {
		return rmobileno;
	}

	public void setRmobileno(String rmobileno) {
		this.rmobileno = rmobileno;
	}

	public String getRcompany() {
		return rcompany;
	}

	public void setRcompany(String rcompany) {
		this.rcompany = rcompany;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public int getRperformance() {
		return rperformance;
	}

	public void setRperformance(int rperformance) {
		this.rperformance = rperformance;
	}

	public String getRteam() {
		return rteam;
	}

	public void setRteam(String rteam) {
		this.rteam = rteam;
	}

	@Override
	public String toString() {
		return "Ro [rage=" + rage + ", rcompany=" + rcompany + ", remail="
				+ remail + ", rid=" + rid + ", rmobileno=" + rmobileno
				+ ", rname=" + rname + ", rno=" + rno + ", rperformance="
				+ rperformance + ", rpwd=" + rpwd + ", rsex=" + rsex
				+ ", rteam=" + rteam + ", rusername=" + rusername + "]";
	}	

}
