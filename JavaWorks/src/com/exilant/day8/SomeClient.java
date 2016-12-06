package com.exilant.day8;

public class SomeClient {
	public static void main(String[] args) {
	
		try {
			Class.forName("com.exilant.day8.SomeBodyClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
