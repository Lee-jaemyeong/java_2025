package com.company.java015_ex;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Score {
	private String name;
	private int kor,eng,math;
	
	public Score() { }
	public Score(String name, int kor, int eng, int math) { 
		this.name = name; this.kor = kor; this.eng = eng; this.math = math; 
	}
	@Override public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	
	@Override
	public int hashCode() {
		return Objects.hash(eng, kor, math, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Score other = (Score) obj;
		return eng == other.eng && kor == other.kor && math == other.math && Objects.equals(name, other.name);
	}
	
}

public class SetEx004 {
	public static void main(String[] args) {
		//1. HashSet 만들기  
		Set<Score> scores = new HashSet<>();
		//2. 아래데이터 넣기
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new Score("헐크"   ,40,60,70)); 
		scores.add(new  Score("캡틴",80,90,100));
		// > 갯수는 3개로 나오게 만들기   ( hashCode, equals)
		System.out.println("유저수 > " + scores.size());
		
		//3. Iterator로 출력하기 - 사용자정보,총점, 평균
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		Iterator<Score> iter = scores.iterator(); //1. set모으기
		while(iter.hasNext()) { //2. 처리대상확인
			Score s = iter.next();
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total/3.0;
			System.out.println( s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMath() + "\t" + total + "\t" + String.format("%.2f", avg));
		} 
	}
}
