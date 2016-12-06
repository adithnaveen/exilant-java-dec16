package com.exilant.day3;

public class VarArgsEx1 {
	

	public static void show(String name, String ... nickNames){
		System.out.println("Name : " + name);
		
		for(String temp : nickNames){
			System.out.println(temp);
		}
		
	}
	
	
	public static void main(String [] args) {

		show("Peter", "Jake", "Sally", "harry");
		
	}
}
