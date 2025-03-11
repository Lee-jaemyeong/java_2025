package com.company.java_oop_repeat;
// abstract와 interface의 공통점과 차이점은?
/*
   공통점 : 자식클래스를 통해 코드를 구현한다.
   차이점 : 추상화정도가 interface가 더 크다.
   abstract : 인스턴스변수,일반메서드,추상메서드 모두 가진다.
   interface : 상수(public,static,final) 와 추상메서드(public,abstract) 밖에 가지지 못한다.
*/
/*
		  Vehicle
	  	↑        ↑
 MotorCycle	    Car(run) @Override
*/

interface Vehicle { public void run(); }
class MotorCycle implements Vehicle {
	@Override public void run() { System.out.println("오토바이가 달립니다."); }
	public void helmet() {System.out.println("헬멧을 착용합니다.");}
}
class Car implements Vehicle {
	@Override public void run() { System.out.println("자동차가 달립니다."); }
	
}
class Driver {
	// public void drive(MotorCycle MotorCycle) { MotorCycle.helmet(); MotorCycle.run(); }
	public void drive(Vehicle v) {
		if( v instanceof MotorCycle ) { ((MotorCycle)v).helmet(); }
		v.run();
	}
}
public class Repeat008_Abstract_009_Interface {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		MotorCycle MotorCycle = new MotorCycle();
		Car Car = new Car();
		
		driver.drive(Car);
		
		System.out.println("\n\n>> 자동차가 고장나서 교통수단을 바꿉니다! ");
		
		driver.drive(MotorCycle);
	}
}
