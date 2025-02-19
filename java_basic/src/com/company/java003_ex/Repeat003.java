package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String[] args) {
		
		int kor = 0; int eng = 0; int math = 0; int total = 0; double avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하시오. ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하시오. ");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하시오. ");
		math = scanner.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.printf("총점 : %d \n평균 : %.2f", total, avg);
	}
}
