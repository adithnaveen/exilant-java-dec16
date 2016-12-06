package com.exilant.day2;

public class Jeep extends FourWheeler{
	public Jeep(){
		System.out.println("Jeep Created...");
	}
	
	public void offRoad(){
		System.out.println("Its good to have JEEP Off Road");
	}

	@Override
	public void move() {
		System.out.println("Jeep Moves... ");
	}
	
	
}
