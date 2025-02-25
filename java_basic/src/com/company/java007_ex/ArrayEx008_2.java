package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008_2 {
	public static void main(String[] args) {
		String[] name= {"아이언맨","헐크","캡틴","토르","호크아이"};
		int[] kor = {100,20,90,70,35};
		int[] eng = {100,50,95,80,100};
		int[] mat = {100,30,90,60,100};
		int[] ever= new int[5];
		String[] pass = new String[5];
		String[] jang = new String[5];
		int[] rank= {1,5,2,4,3};
		//처리
		//1. 평균구하시오.
		//ver-1  (국어+영어+수학)/3
		//ver-2  aver[0] = kor[0] + eng[0] + mat[0]
		for(int i=0;i<name.length;i++) {ever[i] = (kor[i]+eng[i]+mat[i])/3;}
		
		//2. 합격,불합격 - 평균이 60점이상이면 합격아니면 불합격
		
		for(int i=0;i<name.length;i++) {if(ever[i]>=60) {pass[i]="합격";}else{pass[i]="불합격";}}
		
		//3. 장학생 - 평균 95점이상 장학생
		
		for(int i=0;i<name.length;i++) {if(ever[i]>=95) {jang[i]="장학생";}else{jang[i]="----";}}
		
		//출력
		System.out.println(
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
				"이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\n"+ 
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\t%s\t\n"
					,name[i],kor[i],eng[i],mat[i],ever[i],pass[i],jang[i]);
		}
		
	}
}
