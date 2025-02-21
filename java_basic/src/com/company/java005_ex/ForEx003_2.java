package com.company.java005_ex;

public class ForEx003_2 {
	public static void main(String[] args) {
		// 변수
		int sum=0;
		//입력
		
		//처리
		// 현재 합을 구하는 곳에 1을 더하고
		// 현재 합을 구하는 곳에 2를 더하고
		// sum = sum + 1; // 2) sum[1] = 1) 0+1
		// sum = sum + 2; // 2) sum[3] = 1) 1+2
		// sum = sum + 3;
		// for(int i=1; i<=10; i++) {sum = sum + i;}
		for(int i=1; i<=10; i++) {sum+=i; System.out.print(i);
		if(i<10) {System.out.print("+");}
		else if(i==10) {System.out.println(" = "+ sum);}
		}
		//출력
		// System.out.println("1~10까지의 합 : " + sum);
	}
} // 드래그후 ctrl + shift + f = 정렬맞춤
