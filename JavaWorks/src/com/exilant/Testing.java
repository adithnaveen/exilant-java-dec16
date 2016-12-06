package com.exilant;

import java.util.Scanner;

public class Testing {
	
	private int yy;
	public void hi(){
		System.out.println(yy);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("I got " + num);
		
		// we cannot have access specifier in methods and 
		// all variables should be initialized with some value before using it 
		// private int xx; 
		// System.out.println(xx);
		
		
		int a=44, b=45, c=3;
		
		int res = a>b&& a>c?a:b>c?b:c;
		
		System.out.println();
	}
}

















