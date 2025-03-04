package com.company.selftest;

public class SelfTest013 {
	public static void main(String[] args) {
		int num=1;
		int[] arr = new int[6];
		
		for(int i=1;i<arr.length;i++) {arr[i]=num++;System.out.print(arr[i]+"\t");}
	}
}
/*
		[SelfTest015] 배열(1)
		    1. 숫자형공간이 5개인  배열 arr 만들기
		    2. for구문을 이용하여  1~5까지 입력
		    3. for구문을 이용하여  1~5까지 출력
*/