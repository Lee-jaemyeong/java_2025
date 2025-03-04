package com.company.selftest;

import java.util.Scanner;

public class SelfTest {
	public static void cat() {System.out.println("야옹");}
	public static void hap(int a , int b) {System.out.println("두수의 합 : " + (a+b));}
	public static String hi(String hi) {return "Hi! "+hi+"~!";}
	public static void print(int a, int b) {System.out.println(a+b);}
	public static void print(double a, double b) {System.out.println(a+b);}
	
	public static void main(String[] args) {
	// [SelfTest001] 출력(1)
		System.out.println("Hello");
		
	// [SelfTest002] 출력(2) 
		System.out.println(10+"+"+20);
		
	// [SelfTest003] 입력   Scanner 테스트
		String name="";
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요. "); name = scanner.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
	// [SelfTest004] IF (1형식)
		int kor,eng;
		// Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세요 > "); kor = scanner.nextInt();
		System.out.print("영어점수를 입력해주세요 > "); eng = scanner.nextInt();
		if(kor < 40) {System.out.println("국어과락");}
		if(eng < 40) {System.out.println("영어과락");}
		
	// [SelfTest005] IF (2형식)
		int age;
		// Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요. "); age = scanner.nextInt();
		System.out.println((age < 19)? "당신은 미성년자입니다." : "성인입니다.");
		
	// [SelfTest006] If ~ ELSE (3형식)
		int kor1;
		// Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세요 > ");kor1 = scanner.nextInt();
		if(kor1>=90) {System.out.println("수");}
		else if(kor1>=80) {System.out.println("우");}
		else if(kor1>=70) {System.out.println("미");}
		else if(kor1>=60) {System.out.println("양");}
		else {System.out.println("가");}
		
	// [SelfTest007] SWITCH
		char ch=' ';
		// Scanner scanner = new Scanner(System.in);
		System.out.print("a,b,c중에 입력해주세요 "); ch = scanner.next().charAt(0);
		switch(ch){
		case 'a': case'A' : System.out.println("apple"); break;
		case 'b': case'B' : System.out.println("banana"); break;
		case 'c': case'C' : System.out.println("coconut"); break;
		}
		
	// [SelfTest008] for
		for (int i=1;i<=10;i++) {System.out.print(i+"\t");}
	// [SelfTest009] while
		int i=1; while(i<=10) {System.out.print(i+"\t"); i++;}
	// [SelfTest010] do while
		i=1; do {System.out.print(i+"\t"); i++;} while(i<=10);
		
	// [SelfTest011] for
		int num;
		//Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.print("1~100사이 숫자를 입력해주세요 > "); num = scanner.nextInt();
			if(num>=1 && num<=100) {break;}
		}
		
	// [SelfTest012] while
		int num1;
		//Scanner scanner = new Scanner(System.in);
		
		int j=0; while(j>=0) {
			System.out.print("1~100사이 숫자를 입력해주세요 > ");
			num1 = scanner.nextInt();
			if(num1>=1 && num1 <=100) {break;}
			}
		
	// [SelfTest013] for 응용
		int dan;
		//Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 > "); dan = scanner.nextInt();
		for(int k=1;k<=9;k++) {
			System.out.print(dan+"*"+k+"="+(dan*k)+"\n");
		}
		
	// [SelfTest014] 2~4단
		for(int dan1=2;dan1<=4;dan1++) {
			System.out.println(dan1+"단");
			for(int i1=1;i1<=9;i1++) {System.out.print(dan1+"*"+i1+"="+(dan1*i1)+"\n");}
		}
		
	// [SelfTest015] 배열(1)
		int num2=1;
		int[] arr = new int[6];
		for(int i1=1;i1<arr.length;i1++) {arr[i1]=num2++;System.out.print(arr[i1]+"\t");}
		
	// [SelfTest016] 이차원배열
		int num3=100;
		int[][] arr2 = new int[2][3];
		for(int ch1=0;ch<arr2.length;ch1++) {
			for(int kan=0;kan<arr2[ch1].length;kan++) {
				arr2[ch1][kan]=num3++; System.out.print(arr2[ch1][kan]+"\t");}
			System.out.println();
			num3=200;}
		
	// [SelfTest017] 이차원배열
		int num4=1;
		int[][] arr3 = new int[4][5];
		for(int ch3=0;ch3<arr3.length;ch++) {
			for(int kan=0;kan<arr3[ch3].length;kan++) {
				arr3[ch3][kan]=num4++;
				System.out.print(arr3[ch3][kan]+"\t");}
			System.out.println();}
		
	// [SelfTest018] 함수(1) : 함수의 구조
		cat();
		
	// [SelfTest019] 함수(2) : 파라미터
		hap(3,5);
	
	// [SelfTest020] 함수(3) : return 
		System.out.println(hi("sally"));
		
	// [SelfTest021] 함수(4) : 메서드오버로딩
		print(3,5);
		print(1.2,3.4);
		
	/* [SelfTest022] 함수(5) :  
		메서드오버로딩이과 오버라이딩이란?
		오버로딩 - 비슷한 동작을 하는 메서드들을 같은 이름으로 일관되게 작업하는 것
		오버라이딩 - 상속시 자식클래스에 맞게 메서드를 수정
	*/
	}
}
