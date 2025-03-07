package com.company.java014_ex;
// 1. 상속도
/*
 			   Object
 	             ↑
			  Vehicle  (run())
	    ↑               ↑
	MotorCycle         Car
	 (run())         (run())
	 
Driver (사용객체)
 */
interface Vehicle { public void run(); }
class MotorCycle implements Vehicle{ @Override public void run() {System.out.println("오토바이가 달립니다.");} }
class Car implements Vehicle{ @Override public void run() {System.out.println("자동차가 달립니다.");} }
class Driver{
	// ver-1
	// void drive(MotorCycle mo) {mo.run();}
	// void drive(Car car) {car.run();}
	// ver-2
	void drive(Vehicle v){v.run();}
}
public class InterfaceEx003 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Car();
		MotorCycle mo = new MotorCycle();
		
		driver.drive(car); // void drive(Car car) {}
		driver.drive(mo);  // void drive(MotorCycle mo) {}	
		                   // void drive(vehicle v) { v.run(); } @Override  자식메서드
	}
}
/*
------------------------------------------------------------------------------
[method : 정보] Vegicle.class , MotorCycle , Car , Driver , public InterfaceEx003    //##1 설계도
------------------------------------------------------------------------------
[heap : 동적] 						| [stacks : 지역]
                                   driver.drive(mo)   ▶  1번지.drive(Vehicle v   ){        v.run();} 
                                                  ▶          1) Vehicle v=mo; 부모=자식 2) @Override 자식메서드 mo.run()                 
                                   driver.drive(car)  ▶  1번지.drive(Vehicle v   ){        v.run();}
                                                  ▶          1) Vehicle v=car; 부모=자식 2) @Override 자식메서드 car.run()
3번지		MotorCycle {run}            ← mo     3번지
2번지		Car    {run}                ← car    2번지
1번지		Driver {drive}              ← driver 1번지
								    | main  // ##2
------------------------------------------------------------------------------
*/