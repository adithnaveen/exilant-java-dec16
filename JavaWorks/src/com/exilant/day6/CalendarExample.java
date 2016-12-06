package com.exilant.day6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Time " + calendar.getTime());
		
		System.out.println("Minutes " + calendar.get(Calendar.MINUTE));
//		calendar.add(Calendar.DATE, 2);
//		calendar.set(Calendar.DATE, 15);
		calendar.roll(Calendar.DATE, false);
		calendar.roll(Calendar.DATE, false);
		System.out.println(calendar.getTime());
		System.out.println(((GregorianCalendar)calendar).isLeapYear(calendar.get(Calendar.YEAR)));
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		
		calendar.set(2011, 10, 11);
		
		System.out.println(calendar.getTime());
		
	}
}




















