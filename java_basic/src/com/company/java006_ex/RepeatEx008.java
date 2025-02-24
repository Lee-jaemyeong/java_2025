package com.company.java006_ex;

public class RepeatEx008 {
	public static void main(String[] args) {
		int sum1=0 ,sum2=0 ,sum3=0 ,ea=0;
		for (int i=1; i<=10; i++) {
			if(i%3==0) {sum1+=i;}
		} System.out.print(sum1);

		int i=1; while (i<=10); {
			if(i%3==0) {sum2+=i;} i++;
		} System.out.println(sum2);
		
		int j=1; do {
			if(j%3==0) {sum3+=j;} j++;
		} while(j<=10);
		System.out.println(sum3);

	}
}
/*
 1~10 사이의 3의 배수의 합 :  3+6+9=18
 */
