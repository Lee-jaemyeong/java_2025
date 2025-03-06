package com.company.java012;

/*		     Object
		       ↑
		     Calc (exec)
	  ↑     ↑      ↑      ↑
    Plus  Minus  Multi  Divide
   (exec) (exec) (exec) (exec)
*/
class Calc   extends Object { Calc exec( double d1, double d2 ) {System.out.println();
return null;} }
class Plus   extends Calc   { Calc exec( double d1, double d2 ) {System.out.println(d1+d2);
return null;} }
class Minus  extends Calc   { Calc exec( double d1, double d2 ) {System.out.println(d1-d2);
return null;} }
class Multi  extends Calc   { Calc exec( double d1, double d2 ) {System.out.println(d1*d2);
return null;} }
class Divide extends Calc   { Calc exec( double d1, double d2 ) {System.out.println(d1/d2);
return null;} }

public class Poly005_arr {
	public static void main(String[] args) {
		// 부모  =  자식  / 업캐스팅 / 타입캐스팅 필요 X
		Calc controller = null;
		Calc[] my = { new Plus(), new Minus(), new Multi(), new Divide() };
		controller = my[0].exec(10,3);  // 더하기
		controller = my[1].exec(10,3);  // 빼기
		controller = my[2].exec(10,3);  // 곱하기
		controller = my[3].exec(10,3);  // 나누기
	}
}
