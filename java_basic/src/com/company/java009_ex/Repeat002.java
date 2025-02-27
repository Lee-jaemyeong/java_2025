package com.company.java009_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char ch=' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 하나 입력해주세요 > ");
		ch = scanner.next().charAt(0);
		
		switch(ch) {
		case 'j' : System.out.println("java"); break;
		case 'h' : System.out.println("html"); break;
		case 'c' : System.out.println("css"); break;
		}
	}
}
