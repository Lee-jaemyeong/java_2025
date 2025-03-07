package com.company.java014_ex;
// Q8. 오버로딩  : 메서드의 이름을 같게, 알규먼트 자료형과 갯수를 다르게 해 구분 / 비슷한 기능
//     오버라이딩 : 상속시 부모의 메서드를 자식에게 맞게 수정해서 사용
// Q9. abstract : 실체화 된 객체간에 공통되는 특성을 추출한 것 (추상화, 일반화, 공통의 기능 → IS A 고양이는 동물이다.)
// Q10. interface : 개발코드변경없이 객체를 바꿔낄 수 있도록 하는 역할 ( 실체화관계 → can do this! 약속할게,, 구현객체를 통해서 이 서비스 약속)
// Q11. abstract은 인스턴스변수,일반메서드,추상메서드 모두 가짐 (일반클래스 + 설계도)
//      interface는 상수와 추상메서드만 가짐 (설계도 추상화정도가 interface가 더 높다)
//      abstract과 interface의 공통점 : 자식클래스를 통해서 설계부분을 구현한다.

abstract class Fruit {
	@Override public String toString() { return "Fruit"; }
	public abstract void myfruit(); 
}
class Apple extends Fruit {
	@Override public void myfruit() { System.out.println("사과는 빨갛다.");  }
}
class Banana extends Fruit {
	@Override public void myfruit() { System.out.println("바나나는 노랗다."); }
}
class Coconut extends Fruit {
	@Override public void myfruit() { System.out.println("코코넛은 코코하다."); }
}
public class AbstractEx001 {
	public static void main(String[] args) {
		Fruit[] fruit = {new Apple(),new Banana(),new Coconut()};
		// 부모        =  자식들
		// 한개의 자료형(부모)으로 여러개의 객체들(자식들)을 관리
		for(Fruit f:fruit) { f.myfruit(); }
	}
}
