package com.exilant.day6;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		
		Float f = i.floatValue();
		Double d = f.doubleValue();
		
		Byte b = d.byteValue();
		
		i++;
		
		int temp = i;
		temp++; 
		i = temp;
		
		
		Character ch = new Character((char) 9);
		System.out.println(ch.charValue());
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
	}
}
