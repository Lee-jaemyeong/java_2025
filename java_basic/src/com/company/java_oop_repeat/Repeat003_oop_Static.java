package com.company.java_oop_repeat;

class Sawon005 {
	int pay=10000;
	
	static int su=10;
	// static int basicpay=pay; ////###000 클래스 변수 안에 인스턴스 변수를 담을 수 없다.
	static int basicpay2;
	static 	{ basicpay2=20000; }
	
	public static void showSu() {System.out.println(su);} //// ###001 클래스 메서드
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
