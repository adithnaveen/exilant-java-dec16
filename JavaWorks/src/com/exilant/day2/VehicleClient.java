package com.exilant.day2;

public class VehicleClient {
	public static void main(String[] args) {
		
		Vehicle vehicles[] = new Vehicle[4];

		vehicles[0] = new Car();
		vehicles[1] = new Jeep();
		vehicles[2] = new Car();
		vehicles[3] = new Jeep();
		
		// with this stament you can create an object of the 
		// class called Vehicle 
//		Vehicle v = new Vehicle();
//		v.move();
		
		new VehicleBL().showVehicle(vehicles);
		
				
	}
}















