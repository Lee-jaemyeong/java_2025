package com.company.java016_ex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

class UserInfo2 {
	private String name;
	private int age;
	
	public UserInfo2() { super(); }
	public UserInfo2(String name, int age) { super(); this.name = name; this.age = age; }
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
	@Override public int hashCode() { return Objects.hash(age, name); }
	@Override public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}

public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer, UserInfo2> map = new HashMap<>();
		map.put( 1, new UserInfo2("아이언맨", 50) );  // 1 넣어도 Integer( 클래스, 객체 )
		map.put( 2, new UserInfo2("헐크", 40) );    // wrapper 클래스
		map.put( 3, new UserInfo2("캡틴", 120) );   // boxing
		map.put( 1, new UserInfo2("아이언맨-new", 50) ); 
		
		//int a = 1;     기초값 - 객체의 기능사용 불가
		//Integer e = 1; 객체 - 객체의 기능사용 가능      객체 = 기초값 - boxing - wrapper클래스
		
		//향상된for1                                            key         map! key주세요!
		//for(Integer key:map.keySet()) { System.out.println(key + "/" + map.get(key).getName()+ "/" + map.get(key).getAge()); }
		
		//향상된for2
		/*
		for( Entry<Integer,UserInfo2> m :map.entrySet()  ) {
			System.out.println(m.getKey() +"/"+ m.getValue().getName()+ " / " + m.getValue().getAge());
		}
		*/
		
		//keySet
		/*
		Iterator <Integer> iter = map.keySet().iterator();  // iter → [1,2,3] 1.모으기
		while(iter.hasNext()) { //2. 처리대상확인
			Integer key = iter.next();
			System.out.println(key + "/" + map.get(key).getName()+ "/" + map.get(key).getAge());
		}
		*/
		
		//entrySet
		Iterator<Entry<Integer, UserInfo2>> miter = map.entrySet().iterator();
		while(miter.hasNext()) {
			Entry <Integer, UserInfo2> e = miter.next();
			System.out.println(e.getKey() + " / " + e.getValue().getName() + " / " + e.getValue().getAge());
		}
	}
}
