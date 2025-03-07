package com.company.java014;
import java.util.Scanner;

public class Exception003 {
	public static void main(String[] args) {
		int a=-1;
		Scanner scanner = new Scanner(System.in);
		//1을 입력받을때까지 무한반복
		for(;;) {
				try {
					System.out.print("숫자1 입력 > ");
					a = scanner.nextInt(); //1. nextInt() 숫자입력받기를 기다림.
					                       //2. 'a' 
					if(a==1) {break;}
			}catch(Exception e) {
				scanner.next();  //3. a처리
				System.out.println("숫자를 입력해주세요.");}
		}
		System.out.println("결과물 : " + a);
	}
}
/*
	Exception in thread "main" java.util.InputMismatchException //##1
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at com.company.java014.Exception003.main(Exception003.java:12) //##2
*/