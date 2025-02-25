package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		char[][] arr= new char[2][3];
		
		char word='A';
		
		for(int ch=0;ch<arr.length;ch++) {
			for(int kan=0;kan<arr[ch].length;kan++) {
				arr[ch][kan]=word++;
				System.out.print(arr[ch][kan]+"\t");
			}
			word-=2;
			System.out.println();
		}
	}
}
