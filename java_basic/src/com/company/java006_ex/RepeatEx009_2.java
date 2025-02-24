package com.company.java006_ex;

public class RepeatEx009_2 {
	public static void main(String[] args) {
		//ver-1 눈에 보이는 대로 출력
		//	ABCDE
		//	FGHIJ
		//	KLMNO
		//	PQRST
		//	UVWXY
		//	Z
		System.out.println();System.out.println('A');System.out.println('B');System.out.println('C');System.out.println('D');System.out.println('E');
		System.out.println();System.out.println('F');System.out.println('G');System.out.println('H');System.out.println('I');System.out.println('J');
		System.out.println();System.out.println('K');System.out.println('L');System.out.println('M');System.out.println('N');System.out.println('O');
		System.out.println();System.out.println('P');System.out.println('Q');System.out.println('R');System.out.println('S');System.out.println('T');
		System.out.println();System.out.println('U');System.out.println('V');System.out.println('W');System.out.println('X');System.out.println('Y');
		System.out.println('Z');
	
		
		//ver-2
		// System.out.println();                  1) 줄바꿈 - 5번째마다 
		// System.out.println('A'); 알파벳 A~Z      2) 알파벳 5개출력  A~Z   2)알파벳이랑연결?  A(65)  F(70) K(75)
		
//		if('A'%5==0) {System.out.println();} System.out.println('A');
//		if('B'%5==0) {System.out.println();} System.out.println('B');
//		if('C'%5==0) {System.out.println();} System.out.println('C');
//		if('D'%5==0) {System.out.println();} System.out.println('D');
//		if('E'%5==0) {System.out.println();} System.out.println('E');
//		if('F'%5==0) {System.out.println();} System.out.println('F');
	
		for(char i='A'; i<='Z'; i++) {if(i%5==0) {System.out.println();} System.out.print(i);}
		
		char i='A'; while(i<='Z') {if(i%5==0) {System.out.println();} System.out.print(i); i++;}
		
		i='A';  do{if(i%5==0) {System.out.println();} System.out.print(i); i++;} while(i<='Z');
	
	}
}
