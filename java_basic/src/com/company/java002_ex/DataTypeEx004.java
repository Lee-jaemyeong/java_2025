package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String[] args) {
		//변수-입력-처리-출력
		//변수
		int kor, eng, math, total; double avg;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("국어점수를 입력하시오. ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하시오. ");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하시오. ");
		math = scanner.nextInt();
		
		//처리  X
		
		//출력
		total = kor+eng+math;
		avg = total/3.0;   // 정수/정수 = 정수   299/3  몫 > 해결방안) 정수/실수
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("총점: %d \n평균: %.2f", total, avg);
	}
}
