package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main(String[] args) {
		//변수
		int num=0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("숫자를 입력하세요 > ");
		num = scanner.nextInt();
		
		//처리
		switch(num) {
		case 3 : System.out.println("봄"); break;
		case 6 : System.out.println("여름"); break;
		case 9 : System.out.println("가을"); break;
		case 12 : System.out.println("겨울"); break;
		}
		//출력
	}
}
