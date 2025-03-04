package com.company.selftest;

import java.util.Scanner;

public class SelfTest009 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
	
		for(;;) {
			System.out.print("1~100사이 숫자를 입력해주세요 > ");
			num = scanner.nextInt();
			if(num>=1 && num<=100) {break;}
		}
	}
}
/*
		[SelfTest011] for
		  1~100사이를 입력할때까지 무한반복하기 
		  만약 1~100사이를 입력하면 빠져나오기
*/