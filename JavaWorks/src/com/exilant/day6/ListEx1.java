package com.exilant.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class ListEx1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		System.out.println("initial size " + list.size());
		
		list.add(new String("Avinash"));
		list.add("Pooja");
		list.add("Pavitra");
		list.add("Annapoorna");
		
		System.out.println("after adding size " + list.size());
		
		
		System.out.println(list);
		
		for(String temp : list){
			System.out.println(temp);
		}
		
		// the above code is converted internally as shown below 
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}






















