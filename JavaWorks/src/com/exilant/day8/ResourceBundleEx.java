package com.exilant.day8;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleEx {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle");
		
		System.out.println("Locale : " +rb.getLocale());
		System.out.println("Good Morning " + rb.getString("GoodMorning"));
		System.out.println("Good Bye " + rb.getString("GoodBye"));
		System.out.println("==================================================");
		Locale localeFr = new Locale("fr", "FR");
		ResourceBundle rb1 = ResourceBundle.getBundle("ResourceBundle", localeFr);
		
		System.out.println("Locale : " +rb1.getLocale());
		System.out.println("Good Morning " + rb1.getString("GoodMorning"));
		System.out.println("Good Bye " + rb1.getString("GoodBye"));
	}
}
