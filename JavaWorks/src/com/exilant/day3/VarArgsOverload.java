package com.exilant.day3;

public class VarArgsOverload {

	public static void show(Object... vals){
		System.out.println(vals.length);
	}
	
	public static void disp(double ... vals){
		System.out.println("doubles... ");
	}
	
	public static void disp(int ... vals ){
		System.out.println("ints... ");
	}
	public static void main(String[] args) {
//		show(null, null, null);  //show(new Object[null, null, null]);
//		show(null, null);
//		show(new Object[]{null});  // show(null)
		
		disp(11.3, 4);
		
		{
			int x ; 
			x = 100;
		}
		
	
	}
}














