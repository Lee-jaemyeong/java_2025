package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		int big=0,sml=0;
		char[] ch= {'B','a','n','a','n','a'};
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {big++;}
			else if(ch[i]>='a' && ch[i]<='z') {sml++;}	
		}
		System.out.println("대문자 갯수 "+big+"\t"+"소문자 갯수 "+sml);
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {big=ch[i]; System.out.print((char)(big+32)+"\t");}
			else if(ch[i]>='a' && ch[i]<='z') {sml=ch[i]; System.out.print((char)(sml-32)+"\t");}
		}
	}
}
