package com.company.dto;

public class MemberDto {
	private int uno;
	private String uid;
	private String upass;
	private int uphone;
	private String udate;
	private String uip;
	
	public MemberDto() { super(); }
	public MemberDto(int uno, String uid, String upass, int uphone, String udate, String uip) { super(); this.uno = uno; this.uid = uid; this.upass = upass; this.uphone = uphone; this.udate = udate; this.uip = uip; }
	@Override public String toString() { return "MemberDto [uno=" + uno + ", uid=" + uid + ", upass=" + upass + ", uphone=" + uphone + ", udate=" + udate + ", uip=" + uip + "]"; }
	
	public int getUno() { return uno; }
	public void setUno(int uno) { this.uno = uno; }
	public String getUid() { return uid; }
	public void setUid(String uid) { this.uid = uid; }
	public String getUpass() { return upass; }
	public void setUpass(String upass) { this.upass = upass; }
	public int getUphone() { return uphone; }
	public void setUphone(int uphone) { this.uphone = uphone; }
	public String getUdate() { return udate; }
	public void setUdate(String udate) { this.udate = udate; }
	public String getUip() { return uip; }
	public void setUip(String uip) { this.uip = uip; }
	
}
