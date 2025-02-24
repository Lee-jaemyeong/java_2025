package com.company.java006_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
	
		for(char i='A'; i<='Z'; i++) {
			if(i%5==0) {System.out.println();}
			System.out.print(i);
			}
		System.out.println();
		
		char i='A'; while(i<='Z') {
			if(i%5==0) {System.out.println();}
			System.out.print(i); i++;
			}
		System.out.println();
		
		i='A';  do{
			if(i%5==0) {System.out.println();}
			System.out.print(i); i++;} while(i<='Z');
	}
}
