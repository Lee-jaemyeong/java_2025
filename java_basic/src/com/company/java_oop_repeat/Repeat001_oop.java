package com.company.java_oop_repeat;

class Coffee012{
	String menu;
	int cnt,won;
	public Coffee012() { }
	public Coffee012(String menu, int cnt, int won) { this.menu = menu; this.cnt = cnt; this.won = won; }
	void show() {System.out.println("커피이름 : " + this.menu +"\n" + "커피갯수 : " + this.cnt + "\n" + "커피가격 : " + this.won + "\n");}
}
public class Repeat001_oop {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼",2,4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
	}
}
