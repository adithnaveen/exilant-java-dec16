package com.exilant.day6;

public class MathFunctions {
	public static void main(String[] args) {
		System.out.println("PI :"+ Math.PI);
		System.out.println("SQRT :" + Math.sqrt(9));
		System.out.println("Ceil of 12.2 : " + Math.ceil(12.2));
		System.out.println("Floor of 19.9 : " + Math.floor(19.9));

		double rand = Math.random();
		
		System.out.println("Randome value " + (int) (rand*10));
	}
}
