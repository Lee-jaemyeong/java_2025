package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006 {
	public static void main(String[] args) {
		// 변수
		int a;
		Scanner scanner = new Scanner(System.in);
		//입력
		//처리
		for(;;) {
			System.out.print("값을 입력하세요 > ");
			a = scanner.nextInt();
			if(a==9) {break;}
		}
		//출력
	}
}
