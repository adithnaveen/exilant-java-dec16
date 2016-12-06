package com.exilant.day4;

import java.util.Arrays;
import java.util.Comparator;

public class ComputerTemplateSorter{
	// method to sort computers in asc order 
	public static Computer[] sortOnIdAsc(Computer[] computers){
		class SortOnIdAsc implements Comparator<Computer>{

			@Override
			public int compare(Computer o1, Computer o2) {
				return o1.getCumputerId() - o2.getCumputerId();
			}
			
		}
		Arrays.sort(computers, new SortOnIdAsc());
		
		return computers;
	}
	// method to sort computers on name desc 
	
	
	
	public static Computer[] sortOnNameDesc(Computer[] computers){
		
		Arrays.sort(computers,  new Comparator<Computer>(){

			@Override
			public int compare(Computer o1, Computer o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		
		
		return computers;
	}
	
	
	
	// on ascending 
	public static Computer[] sortOnNameAsc(Computer[] computers){
		
		Arrays.sort(computers,  new Comparator<Computer>(){

			@Override
			public int compare(Computer o1, Computer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		return computers;
	}
	
	
	
	
	// method to sort computers asc on price 
	
	public static Computer[] sortOnPrice(Computer [] computers){
		Arrays.sort(computers, new Comparator<Computer>() {

			@Override
			public int compare(Computer o1, Computer o2) {
				return (int) (o1.getPrice() - o2.getPrice());
			}
			
		}
		);
		return computers;
	}
	
	public static String[] getString(Computer[] objs){
		String[] tempObjs = new String[objs.length] ;
		for(int i=0; i<objs.length; i++){
			tempObjs[i] = objs[i].getName();
		}
		return tempObjs;
	}
	
	
	// method to do binary search 
	public static int  checkComputerName(Computer [] computers, String name){
		ComputerTemplateSorter.sortOnNameAsc(computers);
		String[] strs = getString(computers);

		return Arrays.binarySearch(strs, name);
	}
	
	
	
	public static int checkComputer(Computer [] computers, Computer computer) {
		return Arrays.binarySearch(computers, computer);
	}
	
	
	
	
	
	
	
	
	
	
}







