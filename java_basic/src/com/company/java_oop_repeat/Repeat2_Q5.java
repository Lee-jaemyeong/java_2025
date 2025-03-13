package com.company.java_oop_repeat;
/*
 	Object
 	  ↑
 	TestA2  {a = 10 / toString}
 	  ↑
 	TestB2  {b = 20 / toString}
*/
class TestA2{
	int a = 10;
	public TestA2() { super();  }
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2 extends  TestA2{ 
	int b=20;
	public TestB2() { super();  }
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}

public class Repeat2_Q5 {
	public static void main(String[] args) {
		TestA2   ta = new TestA2();    //5-1 ta {a = 10 / toString} = 1번지 {a = 10 / toString}
		// TestB2   tb = (TestB2)ta;      
		//5-2  {b = 20 / toString} - {a = 10 / toString} tb = 1번지 {a = 10 / toString}
		//     {b = 20 / toString} 부분을 사용할 수 없음
		// 오류나는 이유는? 자식 = 부모 / 다운캐스팅 / 타입캐스팅필요
		
		//5-3  해결방안                                                TestB2() → TestA2() → Object{}
		ta = new TestB2(); // ta {a = 10 / toString} = 2번지{b = 20 / toString} - {a = 10 / toString}
		TestB2   tb = (TestB2)ta;
		//  자식 = 부모 / 다운캐스팅 / 타입캐스팅필요 - 부모는 자식생성자를 호출한 적이 있어야 한다.
	}
}
