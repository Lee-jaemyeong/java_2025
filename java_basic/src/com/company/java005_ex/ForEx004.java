package com.company.java005_ex;

public class ForEx004 {
	public static void main(String[] args) {
		//변수
		int con=0;
		//입력
		//처리
		for(int i=1; i<=10; i++) {
			if(i%3==0) {con+=1;}
		}
		//출력
		System.out.println(con);
	}
}
