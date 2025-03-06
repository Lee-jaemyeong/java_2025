package com.company.java013_ex;

class A11 {
	int a; // 1) 인스턴스변수 - heap area - new O - this 각각
	A11() {}
	A11(int a){ this.a = a;} // 2) 지역 변수 - stack area
	
	void show() { this.a =11; System.out.println(this.a); }
	// 3) 인스턴스메서드 - heap area - new O - this 각각
	
	void classMethod() { this.a = 12; }
	// 4) 클래스메서드 - method area - new X - 공유영역
		// 	  static이 jvm 로딩시 제일먼저 메모리상에 올라감. this는 new를 이용해 사용해야함. 순서가 안맞음.
		//    static은 instance 사용불가
	
	int show2() {int a; return this.a;}
	// 5) 인스턴스메서드 - heap area - new O - this 각각
	//    int show2() { int a; return a;}  show2 메서드 안에 있는 int a는 지역변수
	//    int a는 stack - 임시공간 - 변수초기화가 안됨.
	
	// Q4. 생성자 오버로딩,상속
	// Q5. 오버로딩이 성립하기 위한 조건이 아닌 것은?
	//   비슷한 기능의 메서드들의 이름을 같게 만들고, 알큐먼트의 자료형과 갯수로 구분
	//    - c. 리턴타입이 달라야 한다.
	//    - d. 매개변수의 이름이 달라야한다.
}
public class RepeatQ1 {
	public static void main(String[] args) {
		A11 a1 = new A11(); // 6) 지역변수 - stack area
							// b) 메모리 빌려오고, 객체 생성하는 역할: ( new ) 
        					//    String은 null, int는 0으로 초기화하는 역할: ( A11() )
        					//    new A11()한 주소를 갖고 있는 것은: (a1)
	}
}
