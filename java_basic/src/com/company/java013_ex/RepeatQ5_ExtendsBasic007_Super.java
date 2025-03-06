package com.company.java013_ex;

// Q14. 오버라이딩 : 상속시 부모메서드와 같은 메서드
/*
1. 클래스 부품객체 (멤버변수+멤버함수)
		Object         Object () {#3                     }#4
  		 ↑
 		Papa   i , j   Parent(int i, int j){#2  i=10,j=20}#5     
  		 ↑
 		Son2   k       Child(10,20,30){#1      k=30      }#6
*/

class Parent {
	int i,j;
	public Parent() { super(); } // 1) Object
	public Parent(int i, int j) {
		super();  // 2) Object
		this.i = i;
		this.j = j;
	}
}
class Child extends Parent {
	int k;
	public Child() { super(); } // 3) parent()
	public Child(int i, int j,int k) {
		super(i, j); // 4) parent(int i,int j)
		this.k=k;
	}
}
public class RepeatQ5_ExtendsBasic007_Super {
	public static void main(String[] args) {
		Child child = new Child(10,20,30);
		System.out.println(child.i); // 5) 결과 출력 - 10
		System.out.println(child.j); // 5) 결과 출력 - 20
		System.out.println(child.k); // 5) 결과 출력 - 30
	}
}
