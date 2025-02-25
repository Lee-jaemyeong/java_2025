package com.company.java007_ex;

public class Repeat004 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		// [1번지]{1,2,3}  ← arr:1번지  3갯수: 0~2 인덱스번호
		
		// {}  {변수}  for(시작; 종료; 변화)
		for(int i=0;i<arr.length;i++) {System.out.print((i==0? "":",")+arr[i]);}
	}
}
