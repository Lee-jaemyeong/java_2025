package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006_3 {
	public static void main(String[] args) {
		int a,b; double result = ' ';
		char ch =' ';
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("정수를 하나 입력해주세요 > ");
			a = scanner.nextInt();
			if(a>=0 && a<=100) {break;}
			}
		for(;;) {
			System.out.print("정수를 하나 입력해주세요 > ");
			b = scanner.nextInt();
			if(b>=0 && b<=100) {break;}
			}
		for(;;) {
			System.out.print("연산자를 입력해주세요(+,-,*,/) > ");
			ch = scanner.next().charAt(0);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {break;}
			}
		
		switch(ch) {
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/(double)b; break;		
			}
		// 출력               "" + 정수 문자(저장시 숫자) 정수
		//                   10+3=13      , 10/3=3.33
		//                         13.0 -> 13     3.33 -> 소수점둘째자리
		//                         (int)result    String.format("%.2f",result)
		System.out.println("" + a + ch + b + "=" + 
		                   (ch!='/' ? ""+ (int)result : String.format("%.2f",result)));
		}
	}

// 1) 각 연산자에 맞게 계산처리
// 2) 숫자1,숫자2는 0~100사이만 입력가능하게 아니면 무한반복
// 3) 연신자는 +,-,*,/만 입력가능하게 아니면 무한반복

// 1. 정수를 하나 입력해주세요 > 10
// 2. 정수를 하나 입력해주세요 > 3
// 3. 연산자를 입력해주세요(+,-,*,/) > +
// 10+3=13