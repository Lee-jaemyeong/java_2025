package com.company.java015_ex;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//주머니 : index X, 중복허용 X / add , get (X) 향for , size , remove , contains
public class SetEx001 {
	public static void main(String[] args) {
		Set<String> color = new HashSet<>();
		
		color.add("red");  // String e
		color.add("blue");
		color.add("green");
		
		System.out.println("갯수 > " + color.size()); // 3개
		
		//1. 향상된 for
		for(String e : color) {System.out.println(e);}
		System.out.println();
		
		//2. iterator
		Iterator<String> iter = color.iterator(); //1. set 요소 모으기
		while(iter.hasNext()) { //2. 처리대상확인
			System.out.println(iter.next()); // 3. 객체요소 한개 꺼내오기
		}
	}
}
