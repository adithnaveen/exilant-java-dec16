package com.exilant.day7;

import java.util.PriorityQueue;


/**
 * @author trainee
 *	write a program with priority queue which takes the user defined object and 
 *  displays based on sorter given in comparable and comparator 
 */

public class CollectionPriorityQEx6 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.offer("Manohara");
		pq.offer("SowmyaShree");
		pq.offer("Varsha");
		pq.offer("Rishi");
		
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
	}
}
