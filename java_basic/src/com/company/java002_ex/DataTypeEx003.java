package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main(String[] args) {
		//변수-입력-처리-출력
		//변수  (7자리 float / 15자리 double )
		double pi = 0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("파이값을 입력하시오 > ");
		pi = scanner.nextDouble();
		
		//처리  X
		
		//출력
		System.out.println("파이값은 " + pi + "입니다.");
		System.out.printf("파이값은 %f입니다.", pi);
		System.out.printf("\n파이값은 %.2f입니다.", pi);
		System.out.printf("\n파이값은 %.3f입니다.", pi);
	}
}
