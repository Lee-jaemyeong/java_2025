package com.company.java014;

import java.util.Scanner;

public class Exception001 {
	public static void main(String[] args) {
		int a=-1;
		Scanner scanner = new Scanner(System.in);
		//1을 입력받을때까지 무한반복
		for(;;) {
			System.out.print("숫자1 입력 > ");
			a = scanner.nextInt();
			if(a==1) {break;}
		}
		
		System.out.println("결과물 : " + a);
	}
}
