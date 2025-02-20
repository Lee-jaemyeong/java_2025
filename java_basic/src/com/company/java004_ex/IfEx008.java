package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {

	public static void main(String[] args) {
		// 변수
		int kor,eng,math,total;
		double avg;
		String std,level = "";
		String result1 = "불합격";
		String result2 = "가";
		String result3 = "X";
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("학번을 입력하세요 > ");
		std = scanner.next();
		System.out.print("국어 점수를 입력하세요 > ");
		kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 > ");
		eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 > ");
		math = scanner.nextInt();
		total = kor+eng+math;
		avg = total/3.0;
		
		// 처리
		if(avg>=60 && avg<95 && kor>=40 && eng>=40 && math>=40) {result1="합격";}
		if(avg>=95) {result3="장학생";}
		if(avg>=90) {result2="수";}
		else if(avg>=80 && avg<90) {result2="우";}
		else if(avg>=70 && avg<80) {result2="미";}
		else if(avg>=60 && avg<70) {result2="양";}
		
//		level= (avg>=90)? "수" :
//			   (avg>=80)? "우" :
//			   (avg>=70)? "미" :
//			   (avg>=60)? "양" : "가";
		
		// 출력
		System.out.println("======================================================================\r\n"
				+ "학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\r\n"
				+ "======================================================================\r\n"
				+ std+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f", avg)+"\t"+result1+"\t"+result2+"\t"+result3);
	}
}
