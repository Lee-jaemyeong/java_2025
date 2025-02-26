package com.company.java008_ex;

public class Repeat004 {
	public static void main(String[] args) {
		// int[][] arr2 = {{10,20,30},{50,60,70}};
		int[][] arr2 = new int[2][3];
		int data=0;
		for(int ch=0;ch<arr2.length;ch++) {
			for(int kan=0;kan<arr2[ch].length;kan++) {
				arr2[ch][kan]=data+=10;
				System.out.print(arr2[ch][kan]+"\t");
			}
			data+=10;
			System.out.println();
		}
	}
}
