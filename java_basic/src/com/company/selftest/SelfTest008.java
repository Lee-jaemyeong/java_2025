package com.company.selftest;

public class SelfTest008 {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {System.out.print(i+"\t");}
		System.out.println();
		int i=1; while(i<=10) {System.out.print(i+"\t"); i++;}
		System.out.println();
		i=1; do {System.out.print(i+"\t"); i++;} while(i<=10);
	}
}
/*
  		[SelfTest008] for
  			1,2,3,4,5,6,7,8,9,10 출력
  		[SelfTest009] while
  			1,2,3,4,5,6,7,8,9,10 출력
		[SelfTest010] do while 
 			1,2,3,4,5,6,7,8,9,10 출력
*/