package com.exilant.day7;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx2 {
	public static void main(String[] args) {
		List<Number> list1 = new ArrayList<Number>();
		ArrayList<Number> list2  = (ArrayList<Number>) list1;
		
		List list3 = new ArrayList<Number>();
		List<Object> list5 = new ArrayList<Object>();
		
		ArrayList<Number> list4 = (ArrayList<Number>) list3;
		// since list5 is of type safe you cannot cast it 
//		ArrayList<Number> list6 = (ArrayList<Number>) list5;
		
	}
}
