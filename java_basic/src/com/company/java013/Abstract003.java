package com.company.java013;
class Score {
	private String name;
	private int kor,eng,math,total;
	private double avg;
	public Score() { super(); }

	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; } public void setTotal(int total) { this.total = total; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg; }
}
class ScoreDto extends Score {
	private String jang,star,pass;
	public ScoreDto() { super(); } 
	public ScoreDto(String name, int kor, int eng, int math) {
		super.setName(name);
		super.setKor(kor);
		super.setEng(eng);
		super.setMath(math);
	}

	public String getJang() { return jang; }  public void setJang(String jang) { this.jang = jang; }
	public String getStar() { return star; }  public void setStar(String star) { this.star = star; }
	public String getPass() { return pass; }  public void setPass(String pass) { this.pass = pass; }
	
}
abstract class Process {
	abstract double exec(int kor,int eng,int math);
	abstract double exec(int total);
	abstract double exec(double avg);
}
class Total extends Process {
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) {  return 0; }
	@Override double exec(double avg) { return 0; }	
}
class Avg extends Process {
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override double exec(double avg) { return 0; }	
}
class Jang extends Process {
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override double exec(double avg) { return 0; }	
}
class Star extends Process {
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override double exec(double avg) { return 0; }	
}
class Pass extends Process {
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override double exec(double avg) { return 0; }	
}
abstract class Print {
	abstract void show(ScoreDto std);
	abstract void show(ScoreDto[] std);
}
class StdPrint extends Print {
	@Override void show(ScoreDto std) {  } 
	@Override void show(ScoreDto[] std) { } 
}
public class Abstract003 {
	public static void main(String[] args) {
		ScoreDto std = new ScoreDto("헐크" ,100,100,99);
		Process process = null;
		Print print = null;
		print = new StdPrint(); print.show(std);
	}
}
