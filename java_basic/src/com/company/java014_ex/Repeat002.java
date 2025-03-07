package com.company.java014_ex;
import java.util.ArrayList;

/* Q2. 상속도
	Object
	  ↑
	 Papa     money=10        /toString
	  ↑
	 Son      money=150,car=2 /toString
 */
class Papa {
	int money=10;
	public Papa() { }
	public Papa(int money) { this.money = money; }
	@Override public String toString() { return "Papa [money=" + money + "]"; }
}
class Son extends Papa {
	int money=150;
	int car=2;
	public Son() { super(); }
	public Son(int money, int car) { this.money = money; this.car = car; }
	@Override public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}
public class Repeat002 {
	public static void main(String[] args) {
		//-------------------- Step 1
		Papa p1 = new Papa();
		System.out.println(p1); // Q3. Papa [money=10]
		
		//-------------------- Step 2
		Son s2 = new Son();
		System.out.println(s2); // Q4. Son [money=150, car=2]
		
		//-------------------- Step 3
		// Son s3 = new Papa();    // error - Type mismatch: cannot convert from Papa to Son
		// System.out.println(s3); // Q5. 자식은 부모를 담을 수 없다. / 타입캐스팅을 해도 부모 앞자리를 초기화 한 적이 없기 때문에 오류가 난다
		                           //     단,부모가 자식을 호출한 적이 있으면 자식도 부모를 담을 수 있다.
		//-------------------- Step 4
		Papa p4 = new Son();
		System.out.println(p4); // Q6-1. Son [money=150, car=2]
		System.out.println(p4.money); // Q6-2. 10
		
		//-------------------- Step 5
		Papa p5 = new Son();    // 1. 부모 = 자식  / 업캐스팅  / 타입캐스팅필요 X
		Son s5 = (Son)p5;       // 2. 자식 = 부모  / 다운캐스팅 / 타입캐스팅필요
		System.out.println(p5); // Q7-1. Son [money=150, car=2]
		System.out.println(s5.money); // Q7-2. 150
		
		ArrayList<String> list = new ArrayList<>(); // 다음주진행 ctrl + shift + o (import)
		
		// public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
	}
}
