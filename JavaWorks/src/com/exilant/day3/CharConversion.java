package com.exilant.day3;

public class CharConversion {
	public static void main(String[] args) {
		int val = 123456;
		float valf = val;
		int val1 = 123;
		System.out.printf("%d%n", val);
		System.out.printf("%.2f%n", valf);
		System.out.printf("%07d%n", val1);
		System.out.printf("%o%n", val1);
		System.out.printf("%x%n", val1);
		
		int val2 = -20;
		
		// ( will put the value in parenthesis if given value is -ve 
		// if not no parenthesis 
		System.out.printf("%(d%n", val2);
		System.out.printf("%+d%n", val2);
		System.out.printf("%b%n", (10>20));
		System.out.printf("%07d%n", val2);
		
		String str = "hi";
		System.out.printf("%s", str);
	}
}
