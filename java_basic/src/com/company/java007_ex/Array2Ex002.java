package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		int[][] arr2={{101,102,103},{201,202,203}};
		
		for(int ch=0;ch<arr2.length;ch++) {  // 1 층
			for(int kan=0;kan<arr2[ch].length;kan++){ // 2 칸
				System.out.print(arr2[ch][kan]+"\t");
				} System.out.println(); // 3 한층이 끝나고 해야할일
			}
	}
}
