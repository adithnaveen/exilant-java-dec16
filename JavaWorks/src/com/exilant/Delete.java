package com.exilant;


@FunctionalInterface
interface  I1{
	default void log(){
		System.out.println("1Log called... ");
	}
	
	static void s1(){
		System.out.println("static in i1 ");
	}
	public void hii();
}


interface  I2{
	default void log(){
		System.out.println("2Log called... ");
	}
	
}

class Myclass implements I1, I2{

	@Override
	public void log() {
		// TODO Auto-generated method stub
		I1.super.log();
	}

	@Override
	public void hii() {

		System.out.println("abs method hi");
	}

	}

public class Delete {
	public static void main(String[] args) {
//		I1 i1 = new I1() {
//			@Override
//			public void log() {
//					System.out.println("log from impls... ");
//			}
//		};
//		
//		I1.s1();
//		i1.log();
		
		
		Myclass m1 = new Myclass();
		m1.log();
		m1.hii();
	}
}