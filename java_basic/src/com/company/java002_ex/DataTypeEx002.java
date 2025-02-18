package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String[] args) {
		// GIGO
		// 변수 - 입력 - 처리 - 출력
		
		// 변수
		int like;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("좋아하는 숫자를 입력하시오 > ");
		like = scanner.nextInt();
		
		//처리 X
		//출력
		System.out.println("좋아하는 숫자는 " + like + "입니다.");
		System.out.printf("좋아하는 숫자는 $d입니다.", like);
	}
}
