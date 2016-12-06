package com.exilant.day3;

public class StaticEx1 {
	static int val1 = 100;
	public static int add(int num1, int num2){
		return num1 + num2;
	}
	public static void hi(){
		System.out.println("hi Called... ");
	}
	
	static{
		System.out.println("hi i'm first static block");
		val1 = 200;
	}
	
	public static void main(String[] args) {
		System.out.println("Val1 is " + val1);
	}
	
	
	public static void main(String arg){
		System.out.println("hi from psvm string arg");
	}
	static{
		System.out.println("hi i'm from second static block"); 
	}
	
}
