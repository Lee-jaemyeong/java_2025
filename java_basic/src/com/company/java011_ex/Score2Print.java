package com.company.java011_ex;

public class Score2Print {
	public void show(Score2[] std) {
		System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
			"이름\t국어\t영어\t수학\t평균\t합격여부\n"+
			":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		for(Score2 s: std) {System.out.println(s);}
	}
}
