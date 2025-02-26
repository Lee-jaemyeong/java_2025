package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {
	public static int process_total(int a,int b,int c) { return a+b+c;}
	public static double process_avg(int a) {return a/3.0;}
	public static String process_pass(double a,int b,int c,int d) {
		// if(a>=60 && b>=40 && c>=40 && d>=40) {return "합격";}
		// else {return "불합격";}
		return (a>=60 && b>=40 && c>=40 && d>=40)? "합격" : "불합격";
	}
	public static String process_scholar(double a) {
		return (a>=95)? "장학생" : "";
	}
	public static String process_star(double a) {
		if(a==100) {return "**********";}
		else if(a>=90) {return "*********";}
		else if(a>=80) {return "********";}
		else if(a>=70) {return "*******";}
		else if(a>=60) {return "******";}
		else if(a>=50) {return "*****";}
		else if(a>=40) {return "****";}
		else if(a>=30) {return "***";}
		else if(a>=20) {return "**";}
		else {return "*";}
	}
	public static String process_show(String a,int b,int c,int d,int e, double f,String g,String h,String i) {
		return(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+String.format("%.2f",f)+"\t"+g+"\t"+h+"\t"+i+"\n");
	}
	public static String line() { return "--------------------------------------------------------------------------------------------";}
	
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
	    System.out.print("이름을 입력해주세요 > ");
	    name = scanner.next();
	    System.out.print("국어점수를 입력해주세요 > ");
	    kor = scanner.nextInt();
	    System.out.print("영어점수를 입력해주세요 > ");
	    eng = scanner.nextInt();
	    System.out.print("수학점수를 입력해주세요 > ");
	    math = scanner.nextInt();
	    
	    // (3)처리
	    total = process_total(kor,eng,math);
	    avg = (float) process_avg(total);
	    pass = process_pass(avg,kor,eng,math);
	    jang = process_scholar(avg);
	    star = process_star(avg);
	    
	    // (4)출력
	    System.out.print(
	    	":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+ 
	    	"이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\n"+
	    	line()+"\n"+
	    	process_show(name, kor, eng, math, total, avg, pass, jang, star)+
	    	line());
	}
}
