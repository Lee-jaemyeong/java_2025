package com.company.java009_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		char ch=' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 하나 입력해주세요 > ");
		ch = scanner.next().charAt(0);
		
		if(ch=='j') {System.out.println("java");}
		else if(ch=='h') {System.out.println("html");}
		else if(ch=='c') {System.out.println("css");}
	}
}
