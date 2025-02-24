package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006_2 {
	public static void main(String[] args) {
		int a=-1,b=-2; double result = ' ';
		char ch =' ';
		Scanner scanner = new Scanner(System.in);
		/* break ( 빠져나와!) / continue (밑에꺼 skip)
		 for(;;){  // 1-1. 무한반복
		 	// #todo if(잘못썼으면){ 숫자1입력받기 } -> if(!(a>=0 && a<=100)){ 숫자1입력받기 }
		 	// #todo if(잘못썼으면){ 숫자2입력받기 } 
		 	// #todo if(잘못썼으면){ 연산자입력받기 }
		 
		 	// 1-2. 빠져나올 조건-빠져나오기 break
		 }
		 */
		for(;;) {
			if(!(a>=0 && a<=100)) { // 잘쓴범위가 아니라면 입력시도 / 잘쓴범위면 입력 X
				System.out.print("정수를 하나 입력해주세요 > "); a = scanner.nextInt(); continue;
				// continue; 잘못입력받았으면 아래꺼진행하면 안됨
				// -1   101   10[#]
			}
			if(b<0 || b>100) { // -1  ||  101  
				System.out.print("정수를 하나 입력해주세요 > "); b = scanner.nextInt(); continue;
				// -1   101   3[#]
			}
			if(!(ch=='+' || ch=='-' || ch=='*' || ch=='/')) {
				System.out.print("연산자를 입력해주세요(+,-,*,/) > "); ch = scanner.next().charAt(0); continue;
				// +
				// continue; 잘못입력받았으면 아래꺼진행하면 안됨
			}
			switch(ch) {
				case '+' : result = a+b; break;
				case '-' : result = a-b; break;
				case '*' : result = a*b; break;
				case '/' : result = a/(double)b; break;			
				} 
			System.out.println(""+ a + ch + b + "= " +
							   (ch!= '/' ? (int)result:String.format("%.2f", result)));
			break; // a,b,ch 잘쓴경우
			}
		}
	}

// 1) 각 연산자에 맞게 계산처리
// 2) 숫자1,숫자2는 0~100사이만 입력가능하게 아니면 무한반복
// 3) 연신자는 +,-,*,/만 입력가능하게 아니면 무한반복

// 1. 정수를 하나 입력해주세요 > 10
// 2. 정수를 하나 입력해주세요 > 3
// 3. 연산자를 입력해주세요(+,-,*,/) > +
// 10+3=13