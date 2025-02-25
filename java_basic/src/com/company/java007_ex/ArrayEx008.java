package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008 {
	public static void main(String[] args) {
		String[] name= {"아이언맨","헐크","캡틴","토르","호크아이"};
		int[] kor = {100,20,90,70,35};
		int[] eng = {100,50,95,80,100};
		int[] mat = {100,30,90,60,100};
		int[] ever= new int[5];
		int[] rank= {1,5,2,4,3};
		
		for(int i=0;i<ever.length;i++) {ever[i]=((kor[i]+eng[i]+mat[i])/3);}
		
		System.out.println(
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
				"이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t등수\n"+ 
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0;i<name.length;i++) {			
				System.out.print( 
					  name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+ever[i]+"\t"+
					((ever[i]>=60)? "합격":"불합격")+"\t"+((ever[i]>=95)? "장학생":"----")+"\t"+
					  rank[i]+"\n");}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
}
