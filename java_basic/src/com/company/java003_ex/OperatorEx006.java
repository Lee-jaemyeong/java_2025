package com.company.java003_ex;

import java.util.Scanner;

public class OperatorEx006 {
	public static void main(String[] args) {
		int x;
		char ch=' ';
		Scanner scanner = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오 > ");
		x = scanner.nextInt();
		System.out.println("q1: " + (x>3 && x<10));
		
		System.out.print("값을 입력하시오 > ");
		ch = scanner.next().charAt(0);
		System.out.println("q2: " + (ch=='a' || ch=='A'));
		System.out.println("q3: " + (ch>='0' && ch<='9'));
		// System.out.println("q4: " + (ch>=(char)65));
		System.out.println("q4: " + (ch>='A' && ch<='Z' || ch>='a' && ch<='z'));
	}
}
