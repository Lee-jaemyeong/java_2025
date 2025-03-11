package com.company.java_oop_repeat;

class Sawon005 {
	int pay=10000; // 1) 인스턴스 변수, heap, new O, 실체화, this 각각
	
	static int su=10; // 2) 클래스 변수, method area, new X, 공용
	// static int basicpay=pay; ////3) 클래스 변수 ###000 클래스(static) 변수 안에 인스턴스 변수를 담을 수 없다.
	static int basicpay2; // 4) 클래스 변수, method area, new X, 공용
	static 	{ basicpay2=20000; }
	
	public static void showSu() {System.out.println(su);} //// ###001 클래스 메서드, method area, new X, 공유
	// public static void showPay() {System.out.println(this.pay);} //// ###002 클래스 메서드 this 사용 X
	public void showAll001() { //// ###003 인스턴스 메서드 this 사용 O
		System.out.println(su);
		System.out.println(this.pay);
	}
	public static void showAll002() { //// ###004 클래스 메서드 this 사용 X
		//showAll001();                 // error 클래스 메서드 안에 인스턴스 메서드 사용 X
		//System.out.println(this.pay); // error
	}
}

public class Repeat003_oop_Static {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
	}
}
/* 이론
8.  static
   1. jvm이    method area  에 1번만 메모리를 올림
   2. 클래스명.변수명, 클래스명.메서드명
   3. 예시)
    가. 클래스변수        나. method area  다. new X  공용   라. A.company
     class A{ static String company; }
*/
