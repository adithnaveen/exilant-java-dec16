package com.exilant.day7;

import java.util.ArrayList;
import java.util.List;

// this program is to show working of mix of raw and type-safe 
public class CollectionEx1 {
	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public static void main(String[] args) {
		// since this is raw type they can take any value 
		List list1 = new ArrayList();
		
		List numlist = new ArrayList<Number>();
		System.out.println(numlist instanceof List<?>);
		
		list1.add(100);
		list1.add(100.4);
		
		List<Integer> list2 = list1;

		list2.add(20);
		
		// this will give error because the compiler will check for type safe 
//		list2.add(20.4);
		
		for(Integer temp : list2){
			System.out.println(temp);
		}
	}
}
