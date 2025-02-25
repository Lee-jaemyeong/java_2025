package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx006 {
	public static void main(String[] args) {
		//변수
		double[] arr = new double[5];  // new(공간) double(자료형)  [5]갯수
		//대입
		// 1.1 1.2 1.3 1.4 1.5
		// ver-1 arr[0] = 1.1; arr[1] = 1.2; arr[2] = 1.3; arr[3] = 1.4; arr[4] = 1.5;
		// ver-2
		double a=1.1;
		
		//출력
		for(int i=0;i<arr.length;i++) {
			arr[i]=a; a+=0.1; System.out.print(String.format("%.1f", arr[i])+"\t");}
	}
}
