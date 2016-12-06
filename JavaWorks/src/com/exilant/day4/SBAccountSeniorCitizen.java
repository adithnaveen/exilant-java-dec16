package com.exilant.day4;

public class SBAccountSeniorCitizen 
	// we can extend from only one class 
	extends SBAccount 
	// you can implement many interfaces 
	implements ROISeniorCitizen{

	
	@Override
	public void roi() {
		System.out.println("For senior Citizen ROI 8.5" );
	}
	
}
