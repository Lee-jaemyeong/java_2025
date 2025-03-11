package com.company.java_oop_repeat;

class A {
	int a; // 인스턴스변수 , heap area, new O, 실체화 this 각각
	static String company; // 클래스변수, method area, new X, 공용
	void method() {int a = 0; System.out.println(a);} // 지역변수, stack area, 임시 ★주의사항 : 무조건 초기화
	// ☆ error - 권장사항이 아니므로 경고발생
}

public class Repeat002_oop_Class {
	public static void main(String[] args) {
	
	}
}
