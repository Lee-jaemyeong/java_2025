package com.company.selftest;

public class SelfTest019 {
	public static void print(int a, int b) {System.out.println(a+b);}
	public static void print(double a, double b) {System.out.println(a+b);}

	public static void main(String[] args) {
		print(3,5);
		print(1.2,3.4);	
	}
}
/*
		[SelfTest021] 함수(4) : 메서드오버로딩
		 	1. 다음의 결과가 나오게 메서드를 구현하시오		    
				print(3,5);			결과값 :   8 출력
				print(1.2,3.4);		결과값 :   4.6출력
	
*/
/*
 		[SelfTest022] 함수(5) :  
			메서드오버로딩이과 오버라이딩이란?
		메서드오버로딩 - 비슷한 동작을 하는 메서드들을 같은 이름으로 일관되게 작업하는 것
		오버라이딩 - 상속시 자식클래스에 맞게 메서드를 수정
*/