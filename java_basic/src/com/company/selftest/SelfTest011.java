package com.company.selftest;

import java.util.Scanner;

public class SelfTest011 {
	public static void main(String[] args) {
		int dan;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력하세요 > ");
		dan = scanner.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.print(dan+"*"+i+"="+(dan*i)+"\n");
		}
	}
}
/*
 		[SelfTest013] for 응용
  			원하는 단을 입력하세요 _예) 2단
  			2*1 =2
   			2*2 =4 ...
*/