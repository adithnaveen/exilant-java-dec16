package com.exilant.day3;

public class TwoDimVarArgs {

	public static void showCities(String cityName, String [] ... places){
		
		System.out.println("City Name " + cityName);
		
		for(int i=0; i<places.length; i++){
			for(int j=0; j<places[i].length; j++){
				System.out.print(places[i][j] +", ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String [] southPlaces = new String[]{"Vidhna Soudha", "MG Road", "Basavanagudi"};
		String [] northPlaces = new String[]{"Orion Mall", "ISKON"};
		
		String [][] places = new String[][]{southPlaces, northPlaces};
		
		showCities("Bengaluru",
				new String[]{"Vidhna Soudha", "MG Road", "Basavanagudi"}, 
				new String[]{"Orion Mall", "ISKON"});
	}
}
















