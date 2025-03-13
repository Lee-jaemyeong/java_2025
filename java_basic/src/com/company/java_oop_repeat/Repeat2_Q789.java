package com.company.java_oop_repeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Hero {
	private int no;
	private String name;
	private int age;
	
	public Hero() { super(); }
	public Hero(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "Hero [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
}

public class Repeat2_Q789 {
	public static void main(String[] args) {
		// Q7. ArrayList
		// 	 * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기
		System.out.println("======================\r\n"
				+ "NO\tNAME\tAGE\r\n"
				+ "======================");
		List<Hero> list = new ArrayList<>();
		list.add(new Hero(1,"iron",45));
		list.add(new Hero(2,"hulk",38));
		list.add(new Hero(3,"captain",120));
		
		Iterator <Hero> iter1 = list.iterator();
		int total = 0;
		while(iter1.hasNext()) {
			Hero temp = iter1.next();
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getAge());
			total += temp.getAge();
		}
		System.out.println(); 
		 
		System.out.println("총나이 : " + total);
		System.out.println("평균나이 : " + total/list.size());
		
		System.out.println();
		System.out.println();
		
		//Q8. HashSet
		//  *   dto 를 이용하여 HashSet   + Iterator  이용해서 만들기 
		System.out.println("======================\r\n"
				+ "NO\tNAME\tAGE\r\n"
				+ "======================");
		
		Set<Hero> set = new HashSet<>();
		set.add(new Hero(1,"iron",45));
		set.add(new Hero(2,"hulk",38));
		set.add(new Hero(3,"captain",120));
		
		Iterator <Hero> iter2 = set.iterator();
		total = 0;
		while(iter2.hasNext()) {
			Hero temp = iter2.next();
			System.out.println(temp.getNo()+ "\t" + temp.getName() + "\t" + temp.getAge());
			total += temp.getAge();
		}
		System.out.println(); 
		 
		System.out.println("총나이 : " + total);
		System.out.println("평균나이 : " + total/list.size());
		
		System.out.println();
		System.out.println();
		
		//	Q9.   HashMap
		//	  *   dto 를 이용하여 HashMap   + Iterator  이용해서 만들기
		System.out.println("======================\r\n"
				+ "NO\tNAME\tAGE\r\n"
				+ "======================");
		
		Map<Integer,Hero> map = new HashMap<>();
		map.put(1,new Hero(1,"iron",45));
		map.put(2,new Hero(2,"hulk",38));
		map.put(3,new Hero(3,"captain",120));
		
		Iterator <Entry <Integer, Hero>> iter3 = map.entrySet().iterator();
		total = 0;
		while(iter3.hasNext()) {
			Hero temp = iter3.next().getValue();
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getAge());
			total += temp.getAge();
		}
		System.out.println(); 
		 
		System.out.println("총나이 : " + total);
		System.out.println("평균나이 : " + total/list.size());
		
	}
}
/*
 
		 ㅁ 출력된결과
		 ======================
		 NO	NAME	AGE
		 ======================
		 1	iron		45
		 2	hulk		38
		 3	captain		120
		 
		 나이총합 : 203
		 나이평균 : 67.67
*/