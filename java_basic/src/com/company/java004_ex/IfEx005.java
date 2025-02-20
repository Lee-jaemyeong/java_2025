package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		char ch=' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영문자를 입력하시오 > ");
		ch = scanner.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println((char)(ch+32));
		} else if(ch>='a' && ch<='z') {
			System.out.println((char)(ch-32));
		} else {System.out.println("영문자가 아닙니다.");}
	}
}
