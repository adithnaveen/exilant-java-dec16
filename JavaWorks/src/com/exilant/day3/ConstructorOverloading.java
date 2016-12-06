package com.exilant.day3;




class Car{
	private String name;
	private String color;
	
	Car(){}
	
	// if you have parametric constructor then 
	// compiler will not give you defult constructor 

	public Car(String name, String color) {
		// will invoke object class constructor 
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class BMW extends Car{
	boolean fourWheelDrive;
	BMW(String name, String color, boolean fourWheelDrive){
		super(name, color);
		this.fourWheelDrive = fourWheelDrive;
	}
	
	BMW(String name, String color){
		super(name, color);
		this.fourWheelDrive = false;
	}
	
}

class Audi extends Car{}



public class ConstructorOverloading {
	public static void main(String[] args) {
		Car car1 = new Car("AUDI", "White");
		BMW b1 = new BMW("BMW", "Black");

		BMW b2 = null;
		System.out.println("b1 instanceof BMW "+ (b1 instanceof BMW));
		System.out.println("b1 instanceof Car "  +( b1 instanceof Car));
//		System.out.println(b1 instanceof Audi);
		System.out.println(b2 instanceof Car);
	}
}

























