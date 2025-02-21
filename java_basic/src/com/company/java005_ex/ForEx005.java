package com.company.java005_ex;

public class ForEx005 {
	public static void main(String[] args) {
		//변수
		int cnt=0;
		//입력
		//처리
		for(int i='a'; i>='a' && i<='z'; i++) {
			if(i=='a'|| i=='e'|| i=='i'|| i=='o'|| i=='u') {cnt+=1;}
		}
		//출력  소문자 a~z까지 모음의 갯수를 출력하시오.
		System.out.println(cnt);
	}	
}
