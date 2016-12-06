package com.exilant.day2;

public class StudentClient {
	public static void main(String[] args) {
		
		System.out.println("\u0069\u006e\u0074");
		
		Student s = new  Student();
		
		s.setsId(101);
		s.setsName("Peter");
		s.setMark1(89);
		s.setMark2(55);
		s.setMark3(77);
		
		StudentBL sbl = new StudentBL();
		System.out.println("Sum is " + sbl.avgMarks(s));
		
		System.out.println("Avg is " + sbl.sumMarks(s));
		
	}
}
