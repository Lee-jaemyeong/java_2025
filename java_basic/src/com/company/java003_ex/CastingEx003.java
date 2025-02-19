package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main(String[] args) {
		//변수
		char text=' '; // text='\u0000'
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("대문자를 입력하시오 > ");
		text = scanner.next().charAt(0);
		
		//처리(1)
		//text += 32; // 1) + 더하기 (text + 32)  2) = 대입 text = (text+32)
		
		//처리(2)
		text = (char) (text+32);  //text(char:2byte) + 32(int:4byte)
		
		//출력
		System.out.println("입력한 문자 : " + text);
		System.out.printf("입력한 문자 : %c\n", text);
		
		//Q 실수에 정수대입시 실수로
		float fl = 1 + 1.0f;
		System.out.println(fl);
	}
}
