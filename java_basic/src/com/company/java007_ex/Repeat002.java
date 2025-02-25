package com.company.java007_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a,b,c 중 하나를 입력해주세요 > ");
		a=scanner.next().charAt(0);
		
		switch(a) {
		case 'a': System.out.println("apple"); break;
		case 'b': System.out.println("banana"); break;
		case 'c': System.out.println("coconut"); break;
		}
	}
}
