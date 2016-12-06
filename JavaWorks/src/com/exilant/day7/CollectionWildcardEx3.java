package com.exilant.day7;

import java.util.ArrayList;

public class CollectionWildcardEx3 {
	
	public static void display(ArrayList<? extends Number> genlist){
		for(Number temp : genlist){
			System.out.println(temp);
		}
	}
	// this method become unclear to store the values, since we dont know what to pass
//	public static void add(ArrayList<? extends Number> genlist, ){
//		
//	}
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		// this statement will be converted internally as 
		// li.add(new Integer(100));
		li.add(100);
		li.add(200);
		li.add(300);
		
		ArrayList<Double> ld = new ArrayList<Double>();
		ld.add(334.8);
		ld.add(3.8);
		ld.add(56.3);
		ld.add(56.1);
		
		ArrayList<? extends Number> genlist;
		
		genlist = li;
		display(genlist);
		
		genlist = ld;
		display(genlist);		
	// this does not work since no concept of polymorphism when it is wild card characters 	
//		genlist.add(10);
		
		genlist.remove(2);
		
	}
}






















