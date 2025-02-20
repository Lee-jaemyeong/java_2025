package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006_2 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		String result = "남자";
		
		System.out.print("남자면 홀수, 여자면 짝수를 입력하시오 > ");
		num = scanner.nextInt();

		if(num%2==0) {result = "여자";}
		
		System.out.println(result);
	}
}
