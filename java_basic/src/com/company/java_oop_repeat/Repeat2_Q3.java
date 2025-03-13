package com.company.java_oop_repeat;
//2. Milk 클래스를 구현하시오
class Milk {
	private String name;
	private int price;
	
	public Milk() { this.name = "white"; this.price = 1300;}
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }
	@Override public String toString() { return this.name + " / " + this.price; }
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
}

public class Repeat2_Q3 { 
	public static void main(String[] args) { 
		//1. 메인은 다음과 같다. 
		Milk m1 = new Milk("choco" , 1200); 
		System.out.println( m1 );  // 출력된 결과 : choco / 1200
		Milk m2 = new Milk();
		System.out.println( m2 );  // 출력된 결과 : white / 1300
	}
}
