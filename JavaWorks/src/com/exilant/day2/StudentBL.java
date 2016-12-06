package com.exilant.day2;

public class StudentBL {
	public int sumMarks(Student student){
		return student.getMark1() + student.getMark2() + student.getMark3();
	}
	
	public double avgMarks(Student student){
		return (student.getMark1() + student.getMark2() + student.getMark3())/3;
	}
}
