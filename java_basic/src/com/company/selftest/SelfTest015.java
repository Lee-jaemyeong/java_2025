package com.company.selftest;

public class SelfTest015 {
	public static void main(String[] args) {
		int num=1;
		int[][] arr = new int[4][5];
		
		for(int ch=0;ch<arr.length;ch++) {
			for(int kan=0;kan<arr[ch].length;kan++) {
				arr[ch][kan]=num++;
				System.out.print(arr[ch][kan]+"\t");
			}
			System.out.println();
		}
	}
}
/*
		[SelfTest017] 이차원배열
		 	1.4*5 배열만들기
		 	2.배열에 1~20까지 데이터 입력
		 	3.다음과 같이 출력하기 
		 	
		 	1	2	3	4	5
		 	6	7	8	9	10
		 	11	12	13	14 	15
		 	16	17	18	19	20
*/