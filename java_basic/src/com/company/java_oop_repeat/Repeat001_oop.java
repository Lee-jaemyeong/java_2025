package com.company.java_oop_repeat;

//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)

class Coffee012{
	String menu="아메리카노";
	int cnt=1,won=2000;
	public Coffee012() { } // 1) 생성자 오버로딩  2)상속시
	public Coffee012(String menu, int cnt, int won) { this.menu = menu; this.cnt = cnt; this.won = won; }
	void show() {System.out.println("=====커피\n"+"커피명 : " + this.menu +"\n" + "커피잔수 : " + this.cnt + "\n" + "커피가격 : " + this.won);}
}
public class Repeat001_oop {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼",2,4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
	}
}
/**************
Repeat001.java                   <  javac Repeat001.java
Coffee.class , Repeat001.class   <  java  Repeat001 
------------------------------------------------------------
[method : 정보보관]
[1번지]Coffee.class  
[2번지]Repeat001.class  ##1
------------------------------------------------------------
[heap:동적]                        |    [stack:지역]
[2000]번지                         <----[a2 | 2000번지]
{ name="아메리카노", num=1 , price=1500 }                                   
[1000]번지                         <----[a1 | 1000번지]
{  name="까페라떼", num=2, price=4000  }   [main          ]
------------------------------------------------------------
*/