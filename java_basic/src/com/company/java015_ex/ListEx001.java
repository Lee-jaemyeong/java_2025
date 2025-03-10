package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;

public class ListEx001 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
		
		System.out.println();
		System.out.println(colors.get(0)); // red
		System.out.println(colors.get(1)); // green
		System.out.println(colors.get(2)); // blue
		
		System.out.println();
		for(int i=0;i<colors.size();i++) { System.out.println(colors.get(i)); }
	}
}
