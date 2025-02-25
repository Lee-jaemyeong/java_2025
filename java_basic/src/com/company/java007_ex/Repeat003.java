package com.company.java007_ex;

public class Repeat003 {
	public static void main(String[] args) {
		
		for(int i=1;i<=30;i++) {if(i%10==0) {System.out.print(i+"\t");}}
		System.out.println();
		
		int i=1; while(i<=30) {if(i%10==0) {System.out.print(i+"\t");} i++;}
		System.out.println();
		
		i=1; do {if(i%10==0) {System.out.print(i+"\t");} i++;} while(i<=30);
	}
}
