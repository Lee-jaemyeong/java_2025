package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[] args) {
		
		int num1 = 0; int num2 = 0; float avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력 > ");
		num1 = scanner.nextInt();
		System.out.print("숫자입력 > ");
		num2 = scanner.nextInt();
		
		avg = (float)num1/num2;
                                                        //String.format("출력서식", 처리할값);
		System.out.println( num1 + " / " + num2 + " = " + String.format("%.2f", avg)); //##
		System.out.printf("%d / %d = %.2f",num1,num2,avg);
		
	}
}
