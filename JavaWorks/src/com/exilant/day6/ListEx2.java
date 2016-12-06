package com.exilant.day6;

import java.util.ArrayList;
import java.util.List;

class SomeClass{
	public void hi(){
		System.out.println("some class says hi... ");
	}
}


public class ListEx2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>();
		
		list.add("hello");
		list.add(null);
		list.add(true);
		list.add(new Object());
		list.add(new SomeClass());
	
		list.remove(0);
		
		for(Object temp : list){
			System.out.println(temp);
			
			if(temp instanceof SomeClass){
				SomeClass sc = (SomeClass) temp;
				sc.hi();
			}
		}
		
	}
}

















