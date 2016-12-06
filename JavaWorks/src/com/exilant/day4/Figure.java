package com.exilant.day4;


// since we cannot create an object of Figure we 
// make this class as abstract 
public abstract class Figure {
	
	public static double PI = 3.14;
	
	// if you have aleast 1 method which has abstract modifier then 
	// the class has to be declared as abstract 

	// access specifier, access modifier, return value, method name
	public abstract void area();
	
	// it is also possible to have concrete method in the abstract class
	public void draw(){
		System.out.println("hey to draw a Figure i need, Geometry... ");
	}
	
}
