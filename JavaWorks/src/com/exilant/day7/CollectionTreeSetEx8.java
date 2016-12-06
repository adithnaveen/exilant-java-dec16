package com.exilant.day7;

import java.util.NavigableSet;
import java.util.TreeSet;


/**
 * 
 * write a program to store string and while displaying the data to be 
 * displayed in descending order and also have a custom class which can be 
 * stored in Treeset 
 *
 */
public class CollectionTreeSetEx8 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("harry");
		ts.add("peter");
		ts.add("zafrin");
		ts.add("kumar");
		
		System.out.println(ts);
		
		NavigableSet<String> ns1 = ts.headSet("peter", true);
		System.out.println(ns1);
		
		NavigableSet<String> ns = ts.descendingSet();
		
		System.out.println(ns);
		
		
	}
}























