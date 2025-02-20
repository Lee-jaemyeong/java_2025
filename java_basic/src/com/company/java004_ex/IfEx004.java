package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		System.out.print("영문자 한 개를 입력하시오 > ");
		ch = scanner.next().charAt(0);  // scanner,next() "a(0)b(1)c문자열" / .charAt(0)
		// ch = 'A'; 문자한개 'A' / String str = "abc"  문자열
		if(ch>='A' && ch<='Z') {
			System.out.println("대문자");
		} else if(ch>='a' && ch<='z') {
			System.out.println("소문자");
		} else {System.out.println("영문자가 아닙니다.");}
	}
}
