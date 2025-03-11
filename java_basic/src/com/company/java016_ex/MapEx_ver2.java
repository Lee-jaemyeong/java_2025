package com.company.java016_ex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapEx_ver2 {
	public static void main(String[] args) {
		String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 4);
		map.put("C", 2);
		map.put("D", 3);
		map.put("E", 1);
		System.out.println(map);
		Iterator<Entry<String, Integer>> iter =map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> e = iter.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
/*
	번외

	1. 주어진조건
   String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
   HashMap<String, Integer> map = new HashMap<>();

	2. 다음과 같이 출력하시오.
	{A=1, B=4, C=2, D=3, E=1}
	A:#1
	B:####4
	C:##2
	D:###3
	E:#1
	보험왕 > [B]
*/