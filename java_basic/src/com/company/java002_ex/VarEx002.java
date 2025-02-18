package com.company.java002_ex;

public class VarEx002 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		
		System.out.printf("%d+%d=%d\n", a, b, a+b);
		System.out.printf("%d-%d=%d\n", a, b, a-b);
		System.out.printf("%d*%d=%d\n", a, b, a*b);
		System.out.printf("%d/%d=%d", a, b, a/b);
	}
}
