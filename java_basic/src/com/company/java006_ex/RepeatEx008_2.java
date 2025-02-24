package com.company.java006_ex;

public class RepeatEx008_2 {
	public static void main(String[] args) {
		// for, while, do while 3가지 버전으로 1~10까지 3의 배수의 합: 18
		// ver-1 1이 3의 배수라면 합을 더해 주변수에 누적
		//       2가 3의 배수라면 합을 더해 주변수에 누적
		//       3이 3의 배수라면 합을 더해 주변수에 누적
		
		// ver-2 if(1이 3의 배수라면){ 합을 더해 주변수에 누적} if(1%3==0) {sum1+=1;}
		//       if(2가 3의 배수라면){ 합을 더해 주변수에 누적} if(2%3==0) {sum1+=2;}
		//       if(3이 3의 배수라면){ 합을 더해 주변수에 누적} if(3%3==0) {sum1+=3;}
		
		//변수 //입력+처리 //출력
		int sum=0;
		for (int i=1; i<=10; i++) { if(i%3==0) {sum+=i;} }
		System.out.println(sum);
		
		sum=0;
		int i=1; while (i<=10); {if(i%3==0) {sum+=i;} i++;} 
		System.out.println(sum);
		
		sum=0;
		int j=1; do {if(j%3==0) {sum+=j;} j++;} while(j<=10);
		System.out.println(sum);

	}
}
/*
 1~10 사이의 3의 배수의 합 :  3+6+9=18
 */
