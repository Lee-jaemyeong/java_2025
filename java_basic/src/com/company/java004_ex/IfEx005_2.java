package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005_2 {
	public static void main(String[] args) {
		char ch=' ';
		Scanner scanner = new Scanner(System.in);
		String result="알파벳을 입력해주세요!";
		
		System.out.print("영문자를 입력하시오 > ");
		ch = scanner.next().charAt(0);
		
		if(ch>='A' && ch<='Z') { result = ""+ (char)(ch+32); } 
		else if(ch>='a' && ch<='z') { result = ""+ (char)(ch-32); }
		
		System.out.println(result);
	}
}
