package com.exilant.day2;

public class VehicleBL {
	public void showVehicle(Vehicle [] vehicles){
		// ehnahced for loop 
		for(Vehicle temp : vehicles){
			System.out.println("***************************");
			temp.move();
			
			if(temp instanceof Car){
				((Car)temp).abs("BMW");
			}else if(temp instanceof Jeep){
				((Jeep) temp).offRoad();
			}
			
		}
	}
}
