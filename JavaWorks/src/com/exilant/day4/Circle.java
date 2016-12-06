package com.exilant.day4;

public class Circle extends Figure{
	int radius;

	public Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Circle : " + (PI * radius * radius));
	}
}
