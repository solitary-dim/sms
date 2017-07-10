package com.xingtai.sms.domain.entity;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class Hr {
	private int hid;
	private String hname;
	private String husername;
	private String hpwd;
	private String hsex;
	private int hage;
	private String hemail;
	private String hcompany;
	private String hno;
	private String hmobileno;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHusername() {
		return husername;
	}
	public void setHusername(String husername) {
		this.husername = husername;
	}
	public String getHpwd() {
		return hpwd;
	}
	public void setHpwd(String hpwd) {
		this.hpwd = hpwd;
	}
	public String getHsex() {
		return hsex;
	}
	public void setHsex(String hsex) {
		this.hsex = hsex;
	}
	public int getHage() {
		return hage;
	}
	public void setHage(int hage) {
		this.hage = hage;
	}
	public String getHemail() {
		return hemail;
	}
	public void setHemail(String hemail) {
		this.hemail = hemail;
	}
	public String getHcompany() {
		return hcompany;
	}
	public void setHcompany(String hcompany) {
		this.hcompany = hcompany;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getHmobileno() {
		return hmobileno;
	}
	public void setHmobileno(String hmobileno) {
		this.hmobileno = hmobileno;
	}
	public Hr(int hid, String hname, String husername, String hpwd,
			String hsex, int hage, String hemail, String hcompany, String hno,
			String hmobileno) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.husername = husername;
		this.hpwd = hpwd;
		this.hsex = hsex;
		this.hage = hage;
		this.hemail = hemail;
		this.hcompany = hcompany;
		this.hno = hno;
		this.hmobileno = hmobileno;
	}
	public Hr() {
		super();
	}
	@Override
	public String toString() {
		return "Hr [hage=" + hage + ", hcompany=" + hcompany + ", hemail="
				+ hemail + ", hid=" + hid + ", hmobileno=" + hmobileno
				+ ", hname=" + hname + ", hno=" + hno + ", hpwd=" + hpwd
				+ ", hsex=" + hsex + ", husername=" + husername + "]";
	}
	
	

}