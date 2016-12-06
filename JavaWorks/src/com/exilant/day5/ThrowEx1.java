package com.exilant.day5;

public class ThrowEx1 {
	
	public static void checkName(String name){
		if(name == null || name.length()< 5){
			throw new RuntimeException("Sorry name canno be null or less than 5 chars");
		}
	}
	
	public static void checkHike(int salHike, String name) throws Exception{
		try{
		checkName(name);
		}catch(RuntimeException re){
			// partial delegation 
			// 1. surround this with try catch 
			// 2. put throws clause on method 
			throw new Exception("Checking salary not processed", re);
		}
		if(salHike<5000){
			throw new ArithmeticException("Sorry sal hike is too less for me "
					+ name +", i got " + salHike);
		}else if(salHike>5000 && salHike<=7500){
			throw new RuntimeException("I'm okay to work but why so less " + 
					name +" i got " + salHike);
		}else{
			System.out.println("I'm good to continue for next year ");
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			checkHike(12000, "aa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}









