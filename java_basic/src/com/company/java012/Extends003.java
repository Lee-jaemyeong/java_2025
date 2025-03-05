package com.company.java012;
//1. 클래스는 부품객체
//2. 상태는 멤버변수 + 행위는 멤버함수
//3. 상속 - 클래스 재사용(재활용) , 오버라이드(@Override)- 부모메서드 나한테 맞게 수정
/*                                                     MobileNote9 my9 = new MobileNote9();
	Object                                             Object()     {#4     }#5
	  ↑
	MobileNote7   String iris(private)                 MobileNote7(){#3     }#6   iris 초기화
	              void newshow(){} , getter/setter
	  ↑
	MobileNote8   String face(private)                 MobileNote8(){#2     }#7   face 초기화
	              void newshow(){} , getter/setter
	  ↑
	MobileNote9   int battery(private)                 MobileNote9(){#1     }#8   battery 초기화
                  void newshow(){} , getter/setter
 */
class MobileNote7 extends Object {
	private String iris;
	public String getIris() { return iris; }  public void setIris(String iris) { this.iris = iris; }
	void newshow() {System.out.print(":::: NOTE7 새로운기능(Overriding)\n"+"= iris 홍채인식기능 !\n"+"= myiris : "+ this.iris+"\n");}
	// public > protected > package(#)보다 더 넓게 > private
}
class MobileNote8 extends MobileNote7 {
	private String face;
	public String getFace() { return face; }  public void setFace(String face) { this.face = face; }
	@Override void newshow() {
		super.newshow(); // MobileNote7의 newshow()
		System.out.print(":::: NOTE8 새로운기능(Overriding)\n"+"= face 안면인식기능 !\n"+"= myface : "+ this.face+"\n");}
}
class MobileNote9 extends MobileNote8 {
	private int battery=24; // 기본값 -> 명시적 -> 초기화블록 -> 생성자
	public int getBattery() { return battery; }  public void setBattery(int battery) { this.battery = battery; }
	@Override void newshow() {
		super.newshow();  // MobileNote8의 newshow()
		System.out.print(":::: NOTE9 새로운기능(Overriding) 추가\n"+"= battery 하루종일 사용가능 !\n"+"= battery : "+ this.battery);}
	
}
public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newshow();
	}
}
