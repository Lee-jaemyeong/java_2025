package com.company.java013;
abstract class Shape002 {
	abstract void showArea(int w,int h); // {}
	abstract void showArea(int r);       // 설계메서드
}
class Rectangle extends Shape002 {
	@Override void showArea(int w, int h) {System.out.println("□ 사각형의 넓이 : " + (w*h));}
	@Override void showArea(int r) {} // 불필요한 오버라이드
}
class Triangle extends Shape002 {
	@Override void showArea(int w, int h) {System.out.println("□ 삼각형의 넓이 : " + ((w*h)/2));}
	@Override void showArea(int r) {} // 불필요한 오버라이드
}
class Circle extends Shape002 {
	@Override void showArea(int w, int h) {} // 불필요한 오버라이드
	@Override void showArea(int r) {System.out.println("□ 원의 넓이 : " + (r*r*Math.PI));}
}
public class Abstract002 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.showArea(10,10);
		Triangle tri = new Triangle();
		tri.showArea(10,10);
		Circle cir = new Circle();
		cir.showArea(10);
		
		///// ver-2
		Shape002 shape2 = null;
		Shape002 []s    = {new Rectangle(), new Triangle(), new Circle()};
		//                     Circle이니?  shape.showArea(10);
		// instanceof - 객체가 어떤클래스인지 어떤클래스를 상속받았는지 확인
		for(int i=0;i<s.length;i++) {
			if( s[i] instanceof Circle ) { s[i].showArea(10); }
			else {s[i].showArea(10,3);}
		}
	}
}
