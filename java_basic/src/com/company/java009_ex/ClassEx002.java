package com.company.java009_ex;

import java.util.Scanner;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class MyPrice001 {
		String pd="";int price;
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품이름 입력 > "); this.pd = scanner.next();
		System.out.print("상품가격 입력 > "); this.price = scanner.nextInt();
	}
	void show() {
		System.out.println();
		System.out.println("상품정보입니다");
		System.out.println("상품이름: "+this.pd+" / "+"상품가격: "+this.price);
	}
}
public class ClassEx002 {
	public static void main(String[] args) {
        MyPrice001 p1 = new MyPrice001();
        p1.input(); 
        p1.show();
	}
}
/*  클래스(설계도) - 인스턴스화(실제객체) - 객체(인스턴스들,,,,)/인스턴스 p1.pd
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]  MyPrice001.class / ClassEx002.class
----------------------------------------------------------------------------------
[heap:동적]                       |[stack:잠깐빌리기]
23번째:                                p1.show();     1번지.show();  { }
22번째:     {pd=apple, price=1000}     p1.input();    1번지.input(); { }
21번째:1번지 {pd=null, price=0}     ←   p1:1번지                         
                                 | main
----------------------------------------------------------------------------------
*/