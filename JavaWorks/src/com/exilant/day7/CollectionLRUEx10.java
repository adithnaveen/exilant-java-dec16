package com.exilant.day7;

import java.util.LinkedHashMap;

public class CollectionLRUEx10 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new 
				LinkedHashMap<Integer, String>(10, 0.75f, true);
		
		LinkedHashMap<Integer, String> map1 = new 
				LinkedHashMap<Integer, String>();
		
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map);
		map.get(5);
		map.get(3);
		map.get(1);
		System.out.println(map);
	}
}
