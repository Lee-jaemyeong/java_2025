package com.company.java011_ex;
// public(아무데서나 사용) > protected(extends) > package(같은폴더) > private(클래스내)
//                                                            getters/setters
public class Milk {
    private int  mno;   
    private String mname;  
    private  int mprice;
	public int getMprice() {return mprice;}
	// alt+ shift+ s - getters/setters
	public void setMprice(int mprice) {this.mprice = mprice;}
	// alt+ shift+ s - toString
	@Override public String toString() { return "Milk [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]"; } 
}
