package com.company.java010_ex;

class Coffee{
	//멤버변수
	String name;int price, num;
    //생성자
	public Coffee(String name, int num, int price) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public Coffee() { name="아메리카노"; num=1; price=2000; } //기본생성자 자동생성취소
	@Override public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	//멤버함수
	void show() {
		System.out.print(
				"=====커피"+"\n"+
				"커피명 : "+this.name+"\n"+
				"커피잔수 : "+this.num+"\n"+
				"커피가격 : "+this.price+"\n");
	} //커피정보출력
}

public class ClassEx003 {
	public static void main(String[] args) {
	            Coffee a1 = new Coffee("까페라떼",2,4000); a1.show();
	            Coffee a2 = new Coffee(); a2.show();
	}
}
