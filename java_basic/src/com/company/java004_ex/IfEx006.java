package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("남자면 홀수, 여자면 짝수를 입력하시오 > ");
		num = scanner.nextInt();

//		if(num%2==0) {
//			System.out.println("여자");
//		} else {System.out.println("남자");}
		if(num>0) {System.out.println((num%2==0)? "여자":"남자");}
	}
}
