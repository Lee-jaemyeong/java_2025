package com.company.java010_ex;

class Score{
	String stdid; int kor,eng,math,total; double avg;
	void info() {
		total(); // 메서드안에서 메서드 호출가능
		avg();
		System.out.print("학번\tkor\teng\tmath\ttotal\tavg\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",this.stdid,this.kor,this.eng,this.math,this.total,this.avg);
	}
	void total() {total=(kor+eng+math);}
	void avg() {avg=(total/3.0);}
	public Score() { }
	public Score(String stdid, int kor, int eng, int math) {
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	
}

public class ClassEx006 {
	public static void main(String[] args) {
		Score  s1= new Score("std1234",100,100,99); 
		s1.info();
	}
}
