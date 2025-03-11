package com.company.java016;
interface InterA2{  void hi1();}
interface InterB2{  void hi2(String name);} 
interface InterC2{  String hi3();}   
interface InterD2{  String hi4(int num, String name);}   
public class Lambda002 {
	public static void main(String[] args) {
		System.out.println("[STEP1] 매개변수 x , 리턴값 x"); //void hi1()
		//1-1. 익명객체  매개변수 X 리턴 X
		InterA2 a1 = new InterA2() {
			@Override public void hi1() { System.out.println("hi :D"); }
		}; a1.hi1();
		
		//1-2. 람다식 ()->{}
		InterA2 a2 = ()->{System.out.println("hi :D :D");}; a2.hi1();
		InterA2 a3 = ()-> System.out.println("hi :D :D :D"); a3.hi1();
		
		//2-1. 익명객체  매개변수 O 리턴 X
		InterB2 b1 = new InterB2() {
			@Override public void hi2(String name) { System.out.println("hi " + name); }
		}; b1.hi2("sally");
		
		//2-2. 람다식 ()->{}
		InterB2 b2 = (String name)->{System.out.println("hi " + name);}; b2.hi2("bbb");
		InterB2 b3 = (String name)-> System.out.println("hi " + name); b3.hi2("ccc");
		InterB2 b4 =  name -> System.out.println("hi " + name); b4.hi2("ddd");
		
		//3-1 익명객체   매개변수 X 리턴 O
		InterC2 c1 = new InterC2() { @Override public String hi3() { return "good day!"; } };
		System.out.println(c1.hi3());
		
		//3-2 람다식 ()->{}
		InterC2 c2 = ()->{ return "good day!!"; }; System.out.println(c2.hi3());
		InterC2 c3 = ()-> "good day!!"; System.out.println(c3.hi3());
		
		//4-1 익명객체  매개변수 O 리턴 O
		InterD2 d1 = new InterD2() {
			@Override public String hi4(int num, String name) { return "hi" + name + " :D".repeat(num); }
		}; System.out.println(d1.hi4(1, " alpha"));
		
		//4-2 람다식 ()->{}
		InterD2 d2 = (int num, String name)->{ return "hi" + name + " :D".repeat(num);}; System.out.println(d2.hi4(2, " alpha"));
		InterD2 d3 = (num,name) -> "hi" + name + " :D".repeat(num); System.out.println(d3.hi4(3, " alpha"));
	}
}
