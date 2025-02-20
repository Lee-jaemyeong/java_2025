package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		int num1, num2;
		char ch = ' ';
		String result = "다시 입력해주세요";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해주세요 > ");
		num1 = scanner.nextInt();
		System.out.print("정수를 하나 입력해주세요 > ");
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/) > ");
		ch = scanner.next().charAt(0);
		float n = (float)num1/num2;
		
		if(num1>0 && num2>0) {
			if(ch=='+') {result="" + num1 + ch + num2 + " = " + (num1+num2);}
			else if(ch=='-') {result="" + num1 + ch + num2 + " = " + (num1-num2);} 
			else if (ch=='*') {result="" + num1 + ch + num2 + " = " + (num1*num2);} 
			else if (ch=='/') {result="" + num1 + ch + num2 + " = " + String.format("%.2f", n);}
		}
		
		System.out.println(result);
	} //end main
} // end class

//1. 정수를 하나 입력해주세요 > 10
//2. 정수를 하나 입력해주세요 > 3
//3. 연산자를 입력해주세요(+,-,*,/) > +
//10+3=13