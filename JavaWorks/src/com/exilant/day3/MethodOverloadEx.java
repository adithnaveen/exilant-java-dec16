package com.exilant.day3;



public class MethodOverloadEx {

	public void display(int x){
		System.out.println("one int called... ");
	}
	public void display(float x){
		System.out.println("one Float called... ");
	}
	
	public void display(String x){
		System.out.println("One String called... ");
	}
	public void display(String x, int y){
		System.out.println("One String called... ");
	}
	
	public static void main(String[] args) {
		new MethodOverloadEx().display(10);
		new MethodOverloadEx().display(10.4f);
		new MethodOverloadEx().display("Hello");
	}
	
}
