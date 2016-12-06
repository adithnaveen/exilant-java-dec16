package com.exilant.day6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDiff {
	public static void main(String[] args) {
		Calendar today =  new GregorianCalendar();
		System.out.println("Today :" + today.getTime());
		
		Calendar dob = new GregorianCalendar(2010, 03, 20);
		System.out.println("DOB :" + dob.getTime());

		System.out.println(daysBetween(dob, today));
		
	}
	
	
	public static long daysBetween(Calendar dob, Calendar today) {  

		  long daysBetween = 0;  
		  while (dob.before(today)) {  
			  dob.add(Calendar.DAY_OF_MONTH, 1);  
		    daysBetween++;  
		  }  
		  return daysBetween;  
		}  
}
