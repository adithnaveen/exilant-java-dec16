package com.exilant.day4;

public class Rectangle extends Figure{
	private int len;
	private int bre;
	
	public Rectangle(int len, int bre) {
		super();
		this.len = len;
		this.bre = bre;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle : " + (len * bre));
	}
}
