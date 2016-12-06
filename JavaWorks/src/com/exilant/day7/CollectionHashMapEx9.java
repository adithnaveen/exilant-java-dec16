package com.exilant.day7;


/*
 * create a java program to simulate synonym dictionary, assume that you have 5 lists given which 
 * are the synonym for the words, accept the word from the user through cmd line or 
 * with scanner, and show the synonym of the word 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionHashMapEx9 {
	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		
		// for synonym 
		HashMap<String, List<String>> dictionary = 
					new HashMap<String, List<String>>();
		
		List<String> cities = new ArrayList<String>();
		cities.add("New York");
		cities.add("Cupertino");
		cities.add("Palo Alto");
		
		
		map.put("computer", new String[]{"apple", "dell", "toshiba"});
		map.put("phone", new String[]{"euroset", "beetel"});
		map.put("monitor", new String[]{"samsung", "LG"});
		map.put("marker", new String[]{"camlin", "reynolds"});
		map.put("cities", cities.toArray(new String[cities.size()]));

//		System.out.println("Number of Elements " + map.size());
//		
//		System.out.println("Computer is " + map.get("computer"));
//		System.out.println("Phone is " + map.get("phone"));
		

		Set myset = map.entrySet();
		Iterator itr = myset.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String, String[]> entry = (Entry<String, String[]>) itr.next();
			
			System.out.println(entry.getKey());
			for(String temp : entry.getValue()){
				System.out.print("\t" + temp +",");
			}
			System.out.println();
		}
	}
}















