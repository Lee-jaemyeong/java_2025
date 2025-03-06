package com.company.java013_ex;

// Q7. private < default(package) < protected < public

class Car4 extends Object {
	// Q8-1. color 접근제어자가 private이므로 (getters/setters)를 작성해 데이터를 셋팅하고,데이터를 가져오고
	// Q8-2. System.out.prinln(컬러객체명)시 Car4[color=red]가 출력되게 만들려면 (toString)메서드가 필요함.
	private String color; // private 수정하지말기
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	public Car4() { super(); }
	@Override public String toString() { return "Car4 [color=" + color + "]"; }
}

public class RepeatQ3_A011 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red"); // Q9. private는 setter/getter를 사용해야 한다.
		System.out.println(c1); // Car4[color=red]
		// Q10. 클래스를 재사용하기 위해( 새로운 부분을 추가,수정하기 위해서 )
		// Q11. class 자식클래스 extends 부모클래스 {}
	}
}
