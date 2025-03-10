package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		List<String> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		System.out.print("숫자(1,2,3) 입력 > ");
		int num = scanner.nextInt();
	
		// ver-1
		//if(num==0) {System.out.println(numbers.get(0));}
		//else if(num==1) {System.out.println(numbers.get(1));}
		//else if(num==2) {System.out.println(numbers.get(2));}
		
		// ver-2
		//for (int i=1;i<=numbers.size();i++) {
		//	if(num==i) {System.out.println(numbers.get(i-1)); break;}}
		
		// ver-3
		System.out.println(numbers.get(num-1));
	}
}
