package com.company.java_oop_repeat;

//2. MilkPrint 클래스를 구현하시오
class MilkPrint {
	void show(Milk[] milks) {  // milks = [1번지, 2번지, 3번지]
		for(int i=0;i<milks.length;i++) {
			System.out.println(milks[i].getName() + " / " + milks[i].getPrice());
		}
	};
}

public class Repeat2_Q4 {
	public static void main(String[] args) {
		//1. 메인은 다음과 같다.
		Milk []milks = new Milk[3];            // milks = [null, null, null]
		milks[0] = new Milk("white",1000);     // milks[0] = 1번지 {"white", 1000}
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		
		MilkPrint  print = new MilkPrint();   
		print.show(  milks  );
		// 리턴값 메서드명 파라미터
		// void show   Milk[] milks  // milks = [1번지, 2번지, 3번지]
		/* 출력된 결과 : 
		 * white  / 1000
		 * choco  / 1200
		 * banana / 1500 
		*/
	}
}
