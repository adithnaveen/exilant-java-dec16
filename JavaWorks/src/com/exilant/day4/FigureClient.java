package com.exilant.day4;

public class FigureClient {
	public static void main(String[] args) {
		Figure figure = null;
		
		figure = new Rectangle(10, 20);
		figure.area();
		figure.draw();
		
		System.out.println("=======================================");
		figure = new Circle(10);
		figure.area();
		figure.draw();
		
		
		Figure f1 = new Figure() {
			
			int len=10;
			
			
			
			@Override
			public void area() {
				System.out.println("Area of Square is " + (len * len));
			}
		};
		
	f1.area();
	
	
	}
}














