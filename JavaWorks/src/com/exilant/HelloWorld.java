package com.exilant;

public class HelloWorld {
	public static void main(String[] args) {

		addNumber();
		System.out.println("Hello World!!!");
	}

	private static void addNumber() {
		int a = 10; 
		int b =20; 
		
		int result = a + b;
		System.out.println("Result is " + result);
	}
}
