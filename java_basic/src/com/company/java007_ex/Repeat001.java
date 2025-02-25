package com.company.java007_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a,b,c 중 하나를 입력해주세요 > ");
		a = scanner.next().charAt(0);
		
		if(a=='a') {System.out.println("apple");}
		else if(a=='b') {System.out.println("banana");}
		else if(a=='c') {System.out.println("coconut");}
	}
}

/*
0) 이론
1) 자료형 - 기본형,참조형
2) 기본형 - boolean
          byte ,short ,char ,int ,long
          float ,double
3) 형변환은 'boolean'빼고 기본형에서 가능하다.
4) ch가 대문자일 경우 조건식 -> ch >= 'A' && ch <= 'Z'
5) ch가 소문자일 경우 조건식 -> ch >= 'a' && ch <= 'z'
6) a가 0~100사이일 경우 조건식 -> a >= 0 && a <= 100
*/