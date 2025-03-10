package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInfo {
	private String name;
	private int age;
	
	public UserInfo() { }
	public UserInfo(String name, int age) { this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
}

public class ListEx003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<UserInfo> users = new ArrayList<>();
		users.add(new UserInfo("아이언맨" , 50));
		users.add(new UserInfo("헐크" , 40));
		users.add(new UserInfo("캡틴" , 120));
		
		System.out.print("이름을 입력하세요 > ");
		String name = scanner.next();
		
		// if (입력받은 이름이 사용자의 이름이라면){ 유저자료 출력}
		// if(users.get(0).getName().equals("아이언맨")) {System.out.println(users.get(0));}
		// else if(users.get(1).getName().equals("헐크")) {System.out.println(users.get(1));}
		// else if(users.get(2).getName().equals("캡틴")) {System.out.println(users.get(2));}
			
		// for(int i=0;i<=users.size();i++) {
			// UserInfo temp = users.get(i);
			// if(users.get(i).getName().equals(name)) {System.out.println(users.get(i));break;}
			// }
		
		for(UserInfo temp : users) {
			if(temp.getName().equals(name)) {System.out.println(temp.getName() + " / " + temp.getAge());break;}
		}
	}
}
