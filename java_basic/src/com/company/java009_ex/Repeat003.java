package com.company.java009_ex;

public class Repeat003 {
	public static void main(String[] args) {
		for(int i=100;i<=300;i++) {if(i%100==0) {System.out.print(i+"\t");}}
		System.out.println();
		int i=100; while(i<=300) {if(i%100==0) {System.out.print(i+"\t");} i++;}
		System.out.println();
		i=100; do {if(i%100==0) {System.out.print(i+"\t");} i++;} while(i<=300);
		System.out.println();
		for(int j=100;j<=300;j+=100) {System.out.print(j+"\t");}
		System.out.println();
		int j=100; while(j<=300) {System.out.print(j+"\t"); j+=100;}
		System.out.println();
		j=100; do {System.out.print(j+"\t"); j+=100;} while(j<=300);
	}
}
