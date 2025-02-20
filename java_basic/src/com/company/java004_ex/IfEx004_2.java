package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_2 {
	public static void main(String[] args) {
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		String result = "알파벳만 입력가능합니다!";
		System.out.print("영문자 한 개를 입력하시오 > ");
		ch = scanner.next().charAt(0);  // scanner,next() "a(0)b(1)c문자열" / .charAt(0)
		// ch = 'A'; 문자한개 'A' / String str = "abc"  문자열
		if(ch>='A' && ch<='Z') {
			result="대문자";
		} else if(ch>='a' && ch<='z') {
			result="소문자";
		}
		System.out.println(result);
	}
}
