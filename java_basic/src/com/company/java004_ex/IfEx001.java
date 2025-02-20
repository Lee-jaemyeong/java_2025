package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
		int avg;
		Scanner scanner = new Scanner(System.in);
		System.out.print("평균을 입력하시오 > ");
		avg = scanner.nextInt();
//		if(avg>=60) {
//			System.out.println("합격");
//		} else {System.out.println("불합격");}
		if(avg>=0) {System.out.println((avg>=60)? "합격":"불합격");}
		// String result ="불합격";
		// if(avg>=60) { result = "합격"; }
		// System.out.println( result ); //불합격 - 조건에 맞으면 "합격"
	}
}
