package com.company.java016_ex;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// UserInfo    Dto 클래스만들기
class UserInfo {
	private  String name;
	private  int age;
	
	public UserInfo() {  }
	public UserInfo(String name, int age) { this.name = name; this.age = age; }
	

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class Repeat001_Collection {
	public static void main(String[] args) {
		//2. users ArrayList 만들기
		List<UserInfo> users = new ArrayList<>();
		//3. 다음의 데이터 넣기
		users.add(new UserInfo("아이언맨" , 50));
		users.add(new UserInfo("헐크" , 40));
		users.add(new UserInfo("캡틴" , 120));
		System.out.println("갯수 > "+users.size());
		//4. for+size / 향상된 for 이용해서 데이터 출력
		/*
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+"\t"+list.get(i).getAge());
		}
		*/
		for(UserInfo a : users) { System.out.println(a.getName()+"\t"+a.getAge()); }
		System.out.println();
		
		//5. sets  HashSet 만들기
		Set<UserInfo> sets = new HashSet<>();
		//6. 다음의 데이터 넣기
		sets.add(new UserInfo("아이언맨" , 50));
		sets.add(new UserInfo("헐크" , 40));
		sets.add(new UserInfo("캡틴" , 120));
		//7. for+size / 향상된 for 이용해서 데이터 출력
		//for(UserInfo b : sets) { System.out.println(b.getName()+"\t"+b.getAge()); }
		Iterator <UserInfo> iter = sets.iterator();
		while(iter.hasNext()) {
			UserInfo c = iter.next();
			System.out.println(c.getName()+"\t"+c.getAge());
		}
	}
}
