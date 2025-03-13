package com.company.java017_ex;

interface InterTest21 {void test();}
interface InterTest22 {void test(int a);}
interface InterTest23 {int test();}
interface InterTest24 {int test(int a);}

public class Repeat002_Lambda {
	public static void main(String[] args) {
		//람다식으로 구현하시오.
		//Q1 파라미터 X / 리턴값 X
		// InterTest21 test1 = () -> {System.out.println("안녕");} test1.test();
		InterTest21 test1 = () -> System.out.println("안녕"); test1.test();
		//Q2
		// void test(int a);  파라미터 O / 리턴값 X
		// InterTest22 test2 = (int a) -> {System.out.println("안녕".repeat(a));} test2.test();
		InterTest22 test2 = a -> System.out.println("안녕".repeat(a)); test2.test(2);
		//Q3
		// int test();  파라미터 X / 리턴값 O
		// InterTest23 test3 = () -> {return 3; }; System.out.println(test3.test());
		InterTest23 test3 = () -> 3; System.out.println(test3.test());
		//Q4
		// int test(int a); 파라미터 O / 리턴값 O
		// InterTest24 test4 = (int a) -> {return a*10;}; System.out.println(test4.test(3));
		InterTest24 test4 = a -> a*10; System.out.println(test4.test(3));
	}
}
