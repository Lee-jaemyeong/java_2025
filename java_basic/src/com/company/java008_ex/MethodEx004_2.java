package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004_2 {
	public static int process_total(int kor,int eng,int math) { return kor+eng+math;}
	public static float process_avg(int total) {return (float)(total/3.0);}
	public static String process_pass(float avg,int kor,int eng,int math) {
		// if(a>=60 && b>=40 && c>=40 && d>=40) {return "합격";}
		// else {return "불합격";}
		return (avg<60)? "불합격" : (kor<40 || eng<40 || math<40)? "재시험" : "합격";
	}
	public static String process_scholar(float avg) {
		return (avg<95)? "" : "장학생";
	}
	public static String process_star(float avg) {
		String result="";
		for(int i=0;i<(int)avg/10;i++) {result+="*";}
		return result;
	}
	public static void process_show(String name,int kor,int eng,int math,int total, float avg,String pass,String jang,String star) {
		System.out.print(
			":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+ 
	    	"이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\n"+
	    	"--------------------------------------------------------------------------------------------\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\t",name, kor, eng, math, total, avg, pass, jang, star);
	}
	
	public static void main(String[] args) {
		// (1)변수
		String name  = ""; 
	    int kor, eng, math, total ;
	    float avg = 0.0f; 
	    String pass = "";
	    String jang = "";
	    String star= ""; 
	    String level_kor="" , level_eng="" , level_math="";
	    String re = "";
	    Scanner scanner = new Scanner(System.in);
	    
	    // (2)입력
	    System.out.print("이름을 입력해주세요 > "); name = scanner.next();
	    System.out.print("국어점수를 입력해주세요 > "); kor = scanner.nextInt();
	    System.out.print("영어점수를 입력해주세요 > "); eng = scanner.nextInt();
	    System.out.print("수학점수를 입력해주세요 > "); math = scanner.nextInt();
	    
	    // (3)처리
	    total = process_total(kor,eng,math);
	    avg = (float) process_avg(total);
	    pass = process_pass(avg,kor,eng,math);
	    jang = process_scholar(avg);
	    star = process_star(avg);
	    
	    // (4)출력
	    	process_show(name, kor, eng, math, total, avg, pass, jang, star);
	    
	}
}
