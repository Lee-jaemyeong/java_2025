package com.company.java008_ex;

public class Repeat002 {
	public static void main(String[] args) {
		//for
		for(int i=100;i<=300;i++) {if(i%100==0) {System.out.print(i+"\t");}}
		System.out.println();
		//while
		int i=100; while(i<=300) {if(i%100==0) {System.out.print(i+"\t");} i++;}
		System.out.println();
		//do while
		i=100; do {if(i%100==0) {System.out.print(i+"\t");} i++;} while(i<=300);
	}
}
