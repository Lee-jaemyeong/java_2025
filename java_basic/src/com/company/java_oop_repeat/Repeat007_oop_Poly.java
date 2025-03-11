package com.company.java_oop_repeat;
/*
	Object
      ↑
	 Papa  {money = 10000 / GOD-거짓말}
      ↑
     Son2  {money = 1500  / 빅뱅-거짓말}
*/
class Papa extends Object {
	int money=10000;
	public Papa() { super(); }
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son2 extends Papa {
	int money=1500;
	public Son2() { super(); }
	@Override public void sing() {System.out.println("빅뱅-거짓말");}
}
public class Repeat007_oop_Poly {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		System.out.println(mypapa.money); //##1. 10000
		mypapa.sing(); // ##1. 빅뱅-거짓말
		
		//##2.1500이 출력되게 하기
		System.out.println(((Son2)mypapa).money); // 1500
	}
}
