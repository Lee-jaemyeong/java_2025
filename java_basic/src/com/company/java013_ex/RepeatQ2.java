package com.company.java013_ex;

//Q6 컴파일에러
//1. 클래스는 부품객체 ( 상태-멤버변수 와 행위-멤버함수)
//           클래스변수, 인스턴스변수, 지역변수 / 인스턴스메서드, 클래스메서드
//  변수 초기화 단계
//                   기본값      명시적초기화     초기화블록      생성자
//     classValue    1) 0      2) 20       3) 20         4) X
//  instanceValue    5) 0      6) 10       3) 10         4) 10

class MemberCall001 {
	int instanceValue=10;     // 인스턴스변수, heap area, new O, this
	static int classValue=20; // 클래스변수, method area, new X, 공유, 클래스명.변수명
	
	int instanceValue2=classValue;  // 인스턴스 변수 = 클래스변수
	// static int classValue2=instanceValue;
	// 1)라인A - error: static은 u\instance 사용불가
	//          static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	
	static void staticMethod1() { 
		System.out.println(classValue);
	 // System.out.println(instanceValue);	
	} // 2)라인B - error: static은 u\instance 사용불가
	  // static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue); //3)라인C
	}
	static void staticMethod2() {
		System.out.println(classValue);
		// instanceMethod1(); 
		//4)라인D - error: static은 u\instance 사용불가
		// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리할당받고 객체생성후 사용
	}
	void instanceMethod2() { // 인스턴스메서드 - heap area - new O - this
		staticMethod1(); 
		// 5)라인E
	}
}

public class RepeatQ2 {
	public static void main(String[] args) {
		
	}
}
