package com.company.java009_ex;

import java.util.Arrays;

public class Repeat005 {
	public static void main(String[] args) {
		char[][] arr2=new char[2][3];
		char cr='a';
		
		for(int ch=0;ch<arr2.length;ch++) {
			for(int kan=0;kan<arr2[ch].length;kan++) {
				arr2[ch][kan]=cr++;
				System.out.print(arr2[ch][kan]+"\t");
			}
			System.out.println();
		}
	}
}
