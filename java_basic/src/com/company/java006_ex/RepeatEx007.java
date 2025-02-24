package com.company.java006_ex;

public class RepeatEx007 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {System.out.print(i + "\t");}
		System.out.println();
		int i=1; while(i<=5) {System.out.print(i + "\t"); i++;}
		System.out.println();
		i=1; do{System.out.print(i + "\t"); i++;} while(i<=5);
		System.out.println();
		for(int j=5; j>=1; j--) {System.out.print(j + "\t");}
		System.out.println();
		int j=5; while(j>=1) {System.out.print(j + "\t"); j--;}
		System.out.println();
		j=5; do{System.out.print(j + "\t"); j--;} while(j>=1);
		System.out.println();
		for(int k=1; k<=3; k++) {System.out.print("JAVA" + k + "\t");}
		System.out.println();
		int k=1; while(k<=3) {System.out.print("JAVA" + k + "\t"); k++;}
		System.out.println();
		k=1; do{System.out.print("JAVA" + k + "\t"); k++;} while(k<=3);
	}
}
