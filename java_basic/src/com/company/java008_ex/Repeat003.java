package com.company.java008_ex;

public class Repeat003 {
	public static void main(String[] args) {
		// int[] arr = {10,20,30};
		int[] arr = new int[3];
		int data=10;
		for(int i=0;i<arr.length;i++) {arr[i]=data; data+=10; System.out.print(arr[i]+"\t");}
	}
}
