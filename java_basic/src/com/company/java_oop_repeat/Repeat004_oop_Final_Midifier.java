package com.company.java_oop_repeat;
// Q.접근자의 범위를 넓은 범위에서 좁은 범위로 적으시오.
// public > protected > default(package) > private
class User004 {
	char division='A'; // A,B,C,D 4가지 타입으로 분류할 수 있다.
	String jumin="123456-1234567";
	public User004() { }
	public User004(char division, String jumin) { this.division = division; this.jumin = jumin; }
	@Override public String toString() { return "User004 [division=" + division + ", jumin=" + jumin + "]"; }
}

public class Repeat004_oop_Final_Midifier {
	public static void main(String[] args) {
		User004 c1 = new User004('B',"200101-1234567"); System.out.println(c1);
		User004 c2 = new User004();                     System.out.println(c2);
	}
}
