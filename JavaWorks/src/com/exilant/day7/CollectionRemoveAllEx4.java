package com.exilant.day7;

import java.util.ArrayList;

public class CollectionRemoveAllEx4 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		
		ArrayList<Integer> li2 = new ArrayList<Integer>();
	
		li2.add(100);
		li2.add(200);
		li2.add(400);
		
		li.removeAll(li2);
		System.out.println("---------");
		for(Integer temp : li){
			System.out.println(temp);
		}
		
		
		
	}
}
