package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String[] args) {
		//변수
		int dan=0;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("1~9중 하나를 입력하시오 > ");
		dan = scanner.nextInt();
		//처리
		for(int i=1; i<=9; i++) {System.out.println(dan+" * "+i+"= "+(dan*i));}
		//출력
	}
}
