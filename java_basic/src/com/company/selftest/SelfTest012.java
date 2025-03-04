package com.company.selftest;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		for(int dan1=2;dan1<=4;dan1++) {
			System.out.println(dan1+"단");
			for(int i=1;i<=9;i++) {System.out.print(dan1+"*"+i+"="+(dan1*i)+"\n");}
		}
	}
}
/*
   		[SelfTest014] 2~4단
  			2~4단까지 출력하세요
*/