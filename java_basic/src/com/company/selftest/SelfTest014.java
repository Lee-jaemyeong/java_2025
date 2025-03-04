package com.company.selftest;

public class SelfTest014 {
	public static void main(String[] args) {
		int num=100;
		int[][] arr = new int[2][3];
		
		for(int ch=0;ch<arr.length;ch++) {
			for(int kan=0;kan<arr[ch].length;kan++) {
				arr[ch][kan]=num++; System.out.print(arr[ch][kan]+"\t");
			}
			System.out.println();
			num=200;
		}
	}
}
/*
		[SelfTest016] 이차원배열
		 	1. 2*3배열만들기
		 	2. for구문을 이용하여 다음과 같이 데이터 입력
		 	3. for구문을 이용하여 다음과 같이 데이터 출력
		 	   100	101 102
		 	   200	201 202
*/