package com.company.java010_ex;

class Area1 {
	static double pi = 3.14159;
	static double rect(int a, int b) {return a*b;}
	static double triangle(int a, int b) {return a*b*0.5;}
}

public class StaticEx001 {
	public static void main(String[] args) {
		System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
		System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
		System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
	}
}
