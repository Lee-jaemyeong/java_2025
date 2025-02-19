package com.company.java003_ex;

public class OperatorEx005 {
	public static void main(String[] args) {
		int a=3,b=10;
		
		//먼저 값 비교조건 대입
		System.out.println( b+=10 - a-- ); //17
		//1) a--     3
		//2) 10-a    10-3 = 7
		//3) b+= 2)까지 연산된거 b+=7  10+=7 b=17
		//4) ); 후 -- a=2
		
		System.out.println( a+=5 ); // 7
		//1) a=2 2+=5 a=7
		
		System.out.println( a>=10 || a<0 && a>3); //false
		//() 값 비교(>,<) 조건(&&)대입
		//1) a>=10 a=7 7>=10 false
		//2) a<0 7<0 false
		//3) a>3 7>3 true
		//4) &&은 둘 다 만족해야 하므로 false
		//5) &가 >,<보다 우선순위 높음
	}
}
