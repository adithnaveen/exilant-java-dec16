package com.exilant.day7;

import java.util.TreeMap;

public class CollectionTreeMapEx11 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		map.put("monitor", 3000);
		map.put("phone", 4000);
		map.put("marker", 25);
		map.put("bottle", 66);
		
		System.out.println(map);
		System.out.println(map.headMap("marker", true));
		System.out.println(map.tailMap("marker", true));
		System.out.println(map.subMap("marker", "phone"));
		System.out.println(map.subMap("marker", true, "phone", true));
	}
}
