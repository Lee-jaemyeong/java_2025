package com.company.ex;

public class Ex003 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int sum=101;
		
		for(int ch=0;ch<arr.length;ch++) {
			for(int kan=0;kan<arr[ch].length;kan++) {
				arr[ch][kan]=sum; sum++;
				System.out.print(arr[ch][kan]+"\t");
			} System.out.println();
		}
	}
}
