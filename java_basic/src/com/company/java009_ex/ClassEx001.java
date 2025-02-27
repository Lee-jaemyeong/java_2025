package com.company.java009_ex;

class Student001{
	String name;  int no, kor, eng, math;
	void info() {
		int total=this.kor+this.eng+this.math;
		double avg=total/3.0;
		System.out.println("이름: " + this.name);
		System.out.println("총점: " + (total));
		System.out.println("평균: " + String.format("%.2f", avg));
	}
}

public class ClassEx001 {
	public static void main(String[] args) {
		Student001 s1 = new Student001();  //1. new (공간,객체생성) 2. Student001() 초기화 3. s1 지번
		s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
		s1.info();
	}
}
// 클래스는 설계도 - 인스턴스화( heap - new - 객체생성 )를 통해 - 객체(객체들 s1,s2,s3 뭉쳐서 표현) / 인스턴스(각각의 s1.name, s2.name)