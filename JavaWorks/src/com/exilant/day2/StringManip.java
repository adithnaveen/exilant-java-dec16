package com.exilant.day2;

public class StringManip {
	public static void main(String[] args) {
		String str = "apple";
		System.out.println("Str is " + str);
		System.out.println("Stored @ " + str.hashCode());
		
		str = str.substring(0, 2);
		System.out.println("Str is " + str);
		System.out.println("Stored @ " + str.hashCode());
		
		System.out.println("sum is "+(1+2));
		
		String str1 = "india";
		String str2 = "INDIA";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("-------------------------");
		String app="apple";
		String app1 = new String(app);
		
		System.out.println(app.hashCode());
		System.out.println(app1.hashCode());
		System.out.println(app ==app1);
		System.out.println(app.equals(app1));
		
		
		// -ve when value is not found 
		// either will give 0 or +ve value when it is found 

		System.out.println("mobile".indexOf("z"));
		
		System.out.println("mobilo".lastIndexOf("o"));
		
		
		System.out.println("----------------------------");
		
		String[] strs = "hello:how:are:you".split(":");
		for(String temp : strs){
			System.out.println(temp.toUpperCase());
		}
		
		
		
		
	}
}









