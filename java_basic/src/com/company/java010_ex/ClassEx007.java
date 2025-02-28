package com.company.java010_ex;

import java.util.Scanner;

class Calc {
	//상태-멤버변수  :  int num1, num2;  char op;  double result;
	static String name="**계산기**";
	int num1, num2;  char op;  double result;
	//행위-멤버함수  :  void input()   입력받기
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1 > "); this.num1 = scanner.nextInt();
		System.out.print("숫자2 > "); this.num2 = scanner.nextInt();
		System.out.print("연산자 > "); this.op = scanner.next().charAt(0);
	}
	// void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
	void opcalc() {
		if(op=='+') {result= num1+num2;}
		else if(op=='-') {result= num1-num2;}
		else if(op=='*') {result= num1*num2;}
		else if(op=='/') {result= num1/(double)num2;}
	}
	// void show()    연산출력
	void show() {
		opcalc();
		System.out.println (""+num1+op+num2+"="+((op=='/')? String.format("%.2f", result):""+(int)result));
	}
	public Calc() {}
	public Calc(int num1, int num2, char op) { this.num1 = num1; this.num2 = num2; this.op = op; }
}
public class ClassEx007 {
	public static void main(String[] args) {
		System.out.println(Calc.name);   //클래스명.static 변수 - new를 이용해서 사용X
		
		Calc  c1= new Calc(10,3,'+');  
		c1.show();  System.out.println(c1.name); // The static field Calc.name should be accessed in a static way
		Calc  c2= new Calc();  
		c2.input();   
		c2.show(); 
	}
}
/* 소스파일                                                     -- 컴파일(번역) -- 바이트코드
 *  ClassEx007.java [class Calc{} / public ClassEx007{}]                  Calc.class/ClassEx007.class
 ## Class Loader
------------------------------------  [## runtime data area]
[method:정보, static, final:공유]  
  #1. Calc.class/ClassEx007.class / Calc.name[**계산기**] / public static void main(String[] args)
---------------------------------------------------------
[heap:동적]                              |[stack:잠깐빌리기]
37번 2번지{num1:0,num2:0,op:0,result}     ←  c2 : 2번지
36번                                        c1.show();
35번 1번지{num1:10,num2:3,op:'+',result}  ←  c1 : 1번지
33번                                        println( Calc.name ); // **계산기**
                                        | #2. main
---------------------------------------------------------
*/