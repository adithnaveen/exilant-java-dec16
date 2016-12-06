package com.exilant.day6;

import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date date1 = new Date();
		
		System.out.println("Time: " + date1.getTime());
		System.out.println("Year: " + date1.getYear());
		System.out.println("Hrs: " + date1.getHours());

		Date date2 = new Date(date1.getTime() + 1000);
		
		System.out.println("Date 1 :"+ date1);
		System.out.println("Date 2 :"+ date2);
		
		System.out.println("Date1 before Date2 " + date1.before(date2));
		System.out.println("Date1 after Date2 " + date1.after(date2));
	}
}
