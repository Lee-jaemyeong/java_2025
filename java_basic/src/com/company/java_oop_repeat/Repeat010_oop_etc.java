package com.company.java_oop_repeat;
import java.util.Scanner;

public class Repeat010_oop_etc {
	public static int nextInt() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1을 입력하세요 > ");
		return scanner.nextInt(); // a
	}
	public static void main(String[] args) {
		int one=0;
		while(true) { 
			try { one = nextInt(); if(one==1) {break;} 
			} catch(Exception e) {System.out.println("숫자만 입력가능합니다.");}
		} 
	}
}