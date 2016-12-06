package com.exilant;

public class BankClient {

	// starting point for the program 
	public static void main(String[] args) {
		
		System.runFinalizersOnExit(true);
		
		// if you dont have default constructor in the 
		// bank class then compiler will create one for you 
		Bank b1;
		b1 = new Bank();
		
		b1.setBankId(101);
		b1.setBankName("CI");
		b1.setAsset(500000);
		
		// System.out.println(b1.toString());
		System.out.println(b1);
		Bank b2 = new Bank();
	}
}
