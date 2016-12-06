package com.exilant.day4;

import com.exilant.day4.OuterClass.InnerClass;

class OuterClass{
	
	private int oi=100;
	private int val1 = 333;
	
	
	public  void sayHi(){
		InnerClass inner = new InnerClass();
		inner.innerHi();
	}
	
	static class StaticInnerClass{}
	
	
	
	
	class InnerClass{
		
		int ii = 200;
		int val1 = 444;
		public void innerHi(){
			System.out.println("hi from Inner class ");
			System.out.println("oi value " + oi);
			System.out.println("ii value " + ii);
			System.out.println("Inner val1 " + val1);
			System.out.println("Val 1 from outer class " + OuterClass.this.val1);
		}
	}
}


public class InnerClassEx {
	public static void main(String[] args) {
//		OuterClass.InnerClass innerClass = new 
//				OuterClass().new InnerClass();
		
		OuterClass outerClass = new OuterClass();
		InnerClass innerClass = outerClass. new InnerClass();
		
		innerClass.innerHi();
		
		
	}
}















