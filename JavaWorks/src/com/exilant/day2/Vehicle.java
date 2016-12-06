package com.exilant.day2;

public abstract class Vehicle {
	public Vehicle(){
		// super should be the first call in the constructor 
		super();
		System.out.println("Vehicle Object created... ");
	}
	
	public void move(){
		System.out.println();
	}
	
}
