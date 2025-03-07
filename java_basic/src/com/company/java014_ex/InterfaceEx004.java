package com.company.java014_ex;

import java.util.Arrays;
import java.util.Calendar;

/* 연관관계
			         <<interface>>  static final MONEY=10000
	User		→       Launch      abstract    void eat();
	money		       ↑      ↑
	plate	       Burger     KimchiStew
		           price=3900  price=4000
		            eat()       eat()       @Override 
 
   
*/

interface Launch{ int MONEY=10000; void eat(); }
class Burger implements Launch {
	int price;
	public Burger() {this.price = 3900;}
	@Override public void eat() { System.out.println("Burger 냠냠!"); }
	@Override public String toString() { return "Burger"; }
}
class KimchiStew implements Launch {
	int price;
	public KimchiStew() {this.price = 4000;}
	@Override public void eat() { System.out.println("KimchiStew 냠냠!"); }
	@Override public String toString() { return "KimchiStew"; }
}
class User {
	int money; int cnt;
	Launch[] plate;
	User(){this.money=Launch.MONEY; plate=new Launch[3]; cnt=0;}
	void order(Launch l) {  // Launch a = new Burger(); / Launch a = new KimchiStew();
		//1. 주문한 메뉴의 값 확인
		int temp=0;
		if( l instanceof Burger ) {System.out.println("버거하나요~"); temp=(((Burger)l).price);}
		else if( l instanceof KimchiStew ) {System.out.println("김치찌개하나요~"); temp=(((KimchiStew)l).price);}
		
		//2. 내가 가진돈 확인
		if(money<temp) {System.out.println(">> 잔액부족 주문불가능"); return;}
		money-=temp;
		
		//3. plate에 주문받은거 넣기
		plate[cnt++] = l;   //System.out.println(money + "-" + Arrays.toString(plate));
		
		// 버거하나요~ 김치찌개하나요~ 버거하나요~ / 잔액부족 주문불가능
	} // 주문
	
	void show() {
		String order="주문 : ";
		for(int i=0; i<cnt; i++) { order+= ((i!=0)? ",": " ") + plate[i]; }
		System.out.println("\n" + order);
		System.out.println("주문금액 : " + (Launch.MONEY - money));
		System.out.println("잔액 : " + money);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(1)+ "년 "+      // 년
						  (today.get(2)+1) + "월 " + // 월 0~11 (0 : 1월)
				           today.get(5) + "일 ");    // 일
		
		//java.lang.NullPointerException - 공간은 있으나 값이 없다.
		// for(Launch a : plate) { a.eat(); }   //부모에서 메서드호출시 @Override- 자식메서드 호출
		for(int i=0; i<cnt; i++) { plate[i].eat(); }
	}  // 출력
}
public class InterfaceEx004 {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger());
		launchorder.order(new KimchiStew());
		launchorder.order(new Burger());
		launchorder.show();
	}
}
