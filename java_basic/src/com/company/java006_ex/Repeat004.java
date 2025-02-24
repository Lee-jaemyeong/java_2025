package com.company.java006_ex;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("숫자를 입력하세요 > ");
			a = scanner.nextInt();
			if(a==1) {break;}
		}
	}
}
