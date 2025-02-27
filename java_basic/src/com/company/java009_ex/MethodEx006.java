package com.company.java009_ex;

import java.util.Arrays;

public class MethodEx006 {
	
	public static void upper(char[] ch) { // 주소값 → 참조해서 값을 변경
		ch[0]='A';ch[1]='B';ch[2]='C';
		// ch[0]-=32;ch[1]-=32;ch[2]-=32;
		// for(int i=0;i<ch.length;i++) {ch[i]-=32;}
	}
	
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
		System.out.println("1. main. 배열의 주소 : " + System.identityHashCode(ch));
		upper(ch);
		System.out.println("main. 배열값 : " + Arrays.toString(ch));
	}
}
