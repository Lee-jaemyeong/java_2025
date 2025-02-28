package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 속성(멤버변수)과 행위(멤버함수)
class Animal002{
	//속성-멤버변수
	String name; int age;
	//행위-멤버함수
	void show() {System.out.println(this.name + "\t" + this.age);}
}
public class Class002_Animal {
	public static void main(String[] args) {
		Animal002 a1 = new Animal002(); a1.name="sally"; a1.show(); 
		//1. new(공간,객체생성) 2.Animal002() 초기화 3. a1 주소 = 1번지
		Animal002 a2 = new Animal002(); a2.name="alpha"; a2.show(); 
		//1. new(공간,객체생성) 2.Animal002() 초기화 3. a1 주소 = 1번지
	}
} // 인스턴스? a1 , a2 - this.name
/* 
-------------------------------------- [runtime data area]
[method:정보, static, final: 공용정보]  Animal002(클래스-설계도) , public Class002
-------------------------------------------------------------
[heap:동적]                       |[stack:잠깐빌리기]
13번째줄: 1번지 {name=sally,age=0}  ← a1 : 1번지  this
15번째줄: 2번지 {name=alpha,age=0}  ← a2 : 2번지  this
                                | main
-------------------------------------------------------------
*/

/*
Q1. OOP란?
     객체 지향 프로그래밍
   - 부품객체(클래스)를 조립하여 완성해가는 프로그램으로 만드는 기법

Q2. CLASS vs INSTANCE
      CLASS - 설계도(부품객체)
      INSTANCE - 실제로 만들어진 객체
 - 클래스(설계도) 틀로 여러개의 객체(인스턴스)들을 만들 수 있음.
 - 붕어빵기계(설계도) ----------------------------------------->>> 붕어빵들(객체)
                               인스턴스화(heap: 실제만들었는지 확인)          인스턴스 - 각각의 특징
 - 클래스 (부품객체) - 특징에 맞게 코딩
 - 상태(멤버변수)와 행위(멤버함수)

Q3. runtime data area 영역 3가지
 [ method (클래스들의 정보 , static , final ,,,; 공용) , heap(new , this : 동적) , stack( 지역 ) ]

Q4. A11 a1 = new A11();
      1) 메모리빌려오고 객체생성하는 역할 : [ new ]
      2) String null, int=0으로 초기화 :  [ A11() ]
      3) new A11() 한 주소를 갖고 있는 것은? [ a1 ]
*/