package com.company.java_oop_repeat;
//Q1. 클래스를 상속하는 이유?
// - 클래스 수정,삭제를 편하게 하기 위해서 (재사용,재활용)
//Q2. 상속의 형식 class 자식 extends 부모
/*
		Object    Object        #4 Object() {     #5} 객체생성
		  ↑          ↑
	  	 부모         A1         #3 A1() {  a=10;  #6}
	      ↑          ↑
	     자식         B1         #2 B1() {  b=0;   #7}
	                 ↑         
	                 C1         #1 C1() {  c=0;   #8}
	  객체호출순서 :  C1()  B1()  A1()  Object()
	  객체생성순서 :  Object   A1   B1   C1
*/
class A1 extends Object {  // Object를 상속받는다
	int a;
	public A1() { super(); }
	public A1(int a) { super(); this.a = a; }
}
class B1 extends A1 { // A1을 상속받는다
	int b;
	public B1() { super(); }
	public B1(int b) { this.b = b; }
	public B1(int a,int b) { super(a); this.b = b;}
}
class C1 extends B1 { // B1을 상속받는다
	int c;
	
	public C1() { super(); }
	public C1(int a, int b, int c) { super(a, b); this.c = c; }
	public C1(int c) {  this.c = c; }

	public void showC() {
		System.out.println("상속받은 A클래스의 a: " + super.a);
		System.out.println("상속받은 B클래스의 b: " + super.b);
		System.out.println("자신의멤버 C클래스의 c: " + this.c);
	}
}
public class Repeat006_oop_Extends {
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a=10; myc.b=20; myc.c=30; myc.showC();
	}
}
