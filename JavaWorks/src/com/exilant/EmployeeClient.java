package com.exilant;

public class EmployeeClient {
	public static void main(String[] args) {
		System.out.println("Total Memorey - Before " + Runtime.getRuntime().totalMemory());
		System.out.println("Free Memory - Before " + Runtime.getRuntime().freeMemory());
		Employee emp = new Employee();
		
		emp.setEmpId(101);
		emp.setEmpName("Kumar");
		emp.setEmpSal(3333);
		
		System.out.println(emp);
		
		// this invokes the Garbage collector explicitly 
		System.gc();
		// Runtime.getRuntime().gc();
		
		System.out.println("Total Memorey - After " + Runtime.getRuntime().totalMemory());
		System.out.println("Free Memory - After " + Runtime.getRuntime().freeMemory());
	
	}
}
