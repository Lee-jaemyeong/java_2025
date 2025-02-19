package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[] args) {
		
		//변수
		int kor, eng, math, total, level;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("국어점수를 입력하시오. ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력하시오. ");
		eng = scanner.nextInt();
		System.out.print("수학점수를 입력하시오. ");
		math = scanner.nextInt();
		
		//처리
		total = kor+eng+math;
		avg = total/3.0;
		level = (int)avg/10;
		
		//출력  - 줄바꿈   \r\n    \n
		System.out.println("=========================================================\r\n"
				+ ":: GOOD IT SCORE ::\r\n"
				+ "=========================================================\r\n"
				+ "국어\t영어\t수학\t총점\t평균\t레벨");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f", avg)+"\t"+level);
		System.out.printf( "%d\t%d\t%d\t%d\t%.2f\t%d", kor, eng, math, total, avg, level);
	}
}
