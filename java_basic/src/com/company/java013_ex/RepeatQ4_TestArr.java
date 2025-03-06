package com.company.java013_ex;

import java.util.Arrays;

class A{ 
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public A() { super(); }
	@Override public String toString() { return "A [name=" + name + "]"; }
	
}

public class RepeatQ4_TestArr {
	public static void main(String[] args) {
		A[] arr = new A[3];
		arr[0] = new A(); arr[1] = new A(); arr[2] = new A();
		//주의사항!) 생성자를 호출해 인스턴스변수를 사용가능하게 만들어야 함.
		// for(int i=0;i<arr.length;i++) {System.out.println(arr[i]);}
		for(A a : arr) {System.out.println(a);}
	}
}
