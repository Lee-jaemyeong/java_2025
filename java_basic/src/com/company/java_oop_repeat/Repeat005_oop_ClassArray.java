package com.company.java_oop_repeat;

class Score {
	private String name;
	private int kor,eng,math;
	private double avg;
	private String pass;
	
	public Score() { }
	public Score(String name, int kor, int eng, int math) { this.name = name; this.kor = kor; this.eng = eng; this.math = math; }
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg; }
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }
	
}
class ScoreProcess {
	public void process_avg(Score[] std) {
		for(int i=0;i<std.length;i++) {
			std[i].setAvg((std[i].getKor()+std[i].getEng()+std[i].getMath())/3);
		}
	}
	public void process_pass(Score[] std) {
		for(int i=0;i<std.length;i++) {
			std[i].setPass(
					(std[i].getAvg()>=60 ? "합격" :
						std[i].getKor()<40 && std[i].getEng()<40 && std[i].getMath()<40? "과락" : "불합격")
					);
		}
	}
}
class ScorePrint {
	public void show_title() {System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");}
	public void show(Score std) {show_title();}
	public void show(Score[] std) {}
}
public class Repeat005_oop_ClassArray {
	public static void main(String[] args) {
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨",100,100,100);
		std[1] = new Score("헐크",90,60,80);
		std[2] = new Score("블랙팬서",20,60,90);
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint print = new ScorePrint();
		print.show(std);
	}
}
