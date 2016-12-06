package com.exilant.day7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class CollectionVectorEx5 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(6, 3);
		
		Queue<String> q = new LinkedList<String>();

		System.out.println("Initial Size " + vector.size());
		// capacity method is defined only in vector class 
		// but not in List Interface
		System.out.println("Initial Capacity " + vector.capacity());
		
		vector.add("Kanchan");
		vector.add("Harry");
		vector.add("Larry");
		vector.add("Kanchan");
		vector.add("Harry");
		vector.add("Larry");
		vector.add("Larry");
		
		Collections.sort(vector);
		
		System.out.println("After Adding Size " + vector.size());
		System.out.println("After Adding Capacity " + vector.capacity());
		
		
	}
}



















