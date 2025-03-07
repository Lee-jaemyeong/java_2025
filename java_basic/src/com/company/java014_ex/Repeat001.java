package com.company.java014_ex;

/*	1.클래스는 부품객체
	2. 상태(멤버변수)와 행위(멤버함수)
	  Object                                                        Object(){#3    }#4  객체를
	  	↑
	  Parent   x=100                        23번째줄 [x=100 / method] Parent(){#2    }#5  x=100 / -------
	  	       method (Parent Method)
	  	↑ 
	  Child    x=200                                           1번지 Child(){#1      }#6  x=2-- / method
	  		   method (Child Method)
*/
class Parent {
	int x=100;
	void method() { System.out.println("Parent Method"); }
}
class Child extends Parent {
	int x=200;
	void method() {System.out.println("Child Method");}
}
public class Repeat001 {
	public static void main(String[] args) {
		Parent p = new Child();  //1. 메모리빌려오고, 객체생성 2. Child() Parent()# Object 3. p=1번지
		// [x=100 / method]                       [      사용범위          ]
		//                p = 1번지 child()[x=200 / method]-Parent()[x=100 / ------]
		Child c = new Child();
		// [x=200 / method] - [x=100 / method] 
		//                c = 2번지 child()[x=200 / method]-Parent()[x=100 / ------]
		System.out.println("p.x = " + p.x); // p.x = 100
		p.method(); // Child Method
		// #1. 자식생성자호출시 #2. 부모생성자호출(부모인스턴스변수 청소 x=100)
		// #3. 같은 메서드가 있다면 자식메서드로 오버라이드 @Override - 자식메서드 호출
		System.out.println("c.x = " + c.x); // c.x = 200
		c.method(); // Child Method
	}
}
