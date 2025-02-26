package com.company.java008_ex;

public class MethodEx002 {
	public static void test1(int a) {System.out.println(a);}
	public static void test2(double a) {System.out.println(a);}
	public static void hap(int a,int b) {
		int box=0; // 누적박스
		for(int i=a;i<=b;i++) {box+=i;} 
		System.out.println(box);
	}
	public static void disp(int a,char b) {
		for(int i=0;i<=a;i++){System.out.print(b);}
	}
	
	///////////////////////////////////////////////
	public static void main(String[] args) {
		test1(10); //10 출력
		test2(1.2); // 1.2 출력
		hap(3,5); // 3+4+5한값  12 출력
		disp(7,'*'); // *******출력
		//public static void disp(7,'*'){ *이 7번 }
		//public static void disp(int a,char b){ b가 a번 }
	}
}
