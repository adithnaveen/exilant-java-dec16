package com.exilant;

public class Factorial {
	public static void main(String[] args) {
		int result = 1;
		final int num = 6;
		
		for(int i=1; i<=num; i++){
			result *= i;
		}
		
		System.out.println("Factorial of " + num + " is " + result);
	}
	
	/**
	 * 
	 * @return
	 * @author trainee
	 */
	public String someBusinessLogic(){
		return "hi";
	}
}
