package com.company.java007_ex;

public class ArrayEx007 {
	public static void main(String[] args) {
		//변수
		char arr[]= new char [5];  // 공간만 빌리기
		
		// 갯수5 : 인덱스 0~4 for+length
		// ver-1 arr[0] = 'A'; arr[1] = 'B'; arr[2] = 'C'; arr[3] = 'D'; arr[4] = 'E';
		// ver-2
		char data='A';
		
		// for+length
		for(int i=0;i<arr.length;i++) {arr[i]=data; data++; System.out.print(arr[i]+"\t");}
	}
}
