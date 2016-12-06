package com.exilant.day2;

public class Car  extends FourWheeler{
	public Car(){
		super();
		System.out.println("Object Car Created... ");
	}

	@Override
	public void move() {
		System.out.println("Car Moves... ");
	}
	
	public void abs(String carName){
		System.out.println(carName +" has ABX");
	}
	
	
}
