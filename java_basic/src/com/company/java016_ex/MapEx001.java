package com.company.java016_ex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapEx001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("================\r\n" + "KING   NAME\r\n" + "================");
		
		Iterator <String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String k = iter.next();
			System.out.println(k + " " + map.get(k));
			System.out.println("---------------------");
		}
		System.out.print("King의 정보를 제공중입니다.\n이름을 입력하세요 > ");
		String name = scanner.next();
		
		for(Entry <String, String> a : map.entrySet()) {
			if(a.getKey().equals(name)) {System.out.println(a.getKey() + ": " + a.getValue());}
		}
	}
}
