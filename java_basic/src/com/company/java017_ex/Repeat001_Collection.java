package com.company.java017_ex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Milk {
	private int no;
	private String name;
	private int price;
	
	public Milk() { super(); }
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	
	@Override public int hashCode() { return Objects.hash(name, no, price); }
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && no == other.no && price == other.price;
	}
}

public class Repeat001_Collection {
	public static void main(String[] args) {
		//1. dto 이용해서 ArrayList + Iterator 이용해서 만들기
		// List : index O, 중복허용 O / add,get,size,remove,contains
		List<Milk> list = new ArrayList<>();
		list.add(new Milk(1,"white",1000));
		list.add(new Milk(2,"choco",1200));
		list.add(new Milk(3,"banana",1300));
		
		System.out.println("=======================\n" +
						   "NO\tNAME\tPRICE\n" +
				           "=======================");
		
		Iterator <Milk> iter = list.iterator();
		while(iter.hasNext()) {
			Milk e = iter.next();
			System.out.println(e.getNo() + "\t" + e.getName() + "\t" + e.getPrice());
		}	
		System.out.println();
		
		//2. dto 이용해서 HashSet + Iterator 이용해서 만들기
		// Set : index X, 중복허용 X / add,get(X),size,remove,contains
		Set<Milk> set = new HashSet<>();
		set.add(new Milk(1,"white",1000));  // new Milk - heap area
		set.add(new Milk(2,"choco",1200));  // add(주소값)
		set.add(new Milk(3,"banana",1300)); // 1) hashCode (Milk) // 2) equals
		set.add(new Milk(3,"banana",1300)); //3개
		// System.out.println(set.size()); //4개 → 3개 1) hashCode (Milk) // 2) equals
		
		System.out.println("=======================\n" +
				   "NO\tNAME\tPRICE\n" +
		           "=======================");
		
		Iterator <Milk> iter2 = set.iterator();
		while(iter2.hasNext()) {
			Milk ee = iter2.next();
			System.out.println(ee.getNo() + "\t" + ee.getName() + "\t" + ee.getPrice());
		}
		System.out.println();
		
		//3. dto 이용해서 HashMap + Iterator 이용해서 만들기
		// Map : Map<Key:Integer:객체,Value:Milk:객체> / put,get(key),size,remove,contains
		Map<Integer,Milk> map = new HashMap<>();
		map.put(1, new Milk(1,"white",1000)); 
		//key : Integer i = 1;  - Wrapper - boxing
		//value : Milk  milk = new Milk(1,"white",1000); - Wrapper - boxing
		map.put(2, new Milk(2,"choco",1200));
		map.put(3, new Milk(3,"banana",1300));
		
		System.out.println(map.entrySet());
		// [1=Milk [no=1, name=white, price=1000], 2=Milk [no=2, name=choco, price=1200], 3=Milk [no=3, name=banana, price=1300]]
		
		System.out.println("=======================\n" +
				   "NO\tNAME\tPRICE\n" +
		           "=======================");
		
		Iterator<Entry<Integer, Milk>> iter3 = map.entrySet().iterator();
		while(iter3.hasNext()) {
			Entry<Integer, Milk> eee = iter3.next();
			//System.out.println(eee.getKey());
			//System.out.println(eee.getValue());
			Milk temp = eee.getValue();
			//Milk temp = map.get(eee.getkey());  map에서 key를 넣으면 값이 나옴
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		}
	}
}
