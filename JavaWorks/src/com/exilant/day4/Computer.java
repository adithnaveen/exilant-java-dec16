package com.exilant.day4;

public class Computer implements Comparable<Computer> {
	private int cumputerId;
	private String name;
	private double price;
	
	public Computer(int cumputerId, String name, double price) {
		super();
		this.cumputerId = cumputerId;
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Computer [cumputerId=" + cumputerId + ", name=" + name + ", price=" + price + "]";
	}



	public int getCumputerId() {
		return cumputerId;
	}
	public void setCumputerId(int cumputerId) {
		this.cumputerId = cumputerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public int compareTo(Computer o) {
		
		// return o.getName().compareTo(this.name);
		// ascending order of price 
//		return (int) (this.price - o.getPrice());
		// descending order of price 
		return (int) (o.getPrice() - this.price);
	}
}

















