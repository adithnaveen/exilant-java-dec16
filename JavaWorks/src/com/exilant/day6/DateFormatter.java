package com.exilant.day6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M YYYY d zzz H.m.s");
		
		System.out.println(sdf.format(now));
		
		System.out.printf("%1$tB %1$tY %1$td" , now);
	}
}
