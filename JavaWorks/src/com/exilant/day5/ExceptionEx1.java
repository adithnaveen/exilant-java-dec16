package com.exilant.day5;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try{
		int res;
		int num1 = Integer.parseInt(args[0]); 
		int num2 = Integer.parseInt(args[1]); 
		
		try{
		int [] myarr = new int[Integer.parseInt(args[2])];
		}catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException nase){
			System.out.println("Problem with arrays " + 
					nase.getMessage());
		}catch(NumberFormatException nfe){
			System.out.println("you cannot create array with chars... ");
		}
		
		res = num1 / num2;
		
		System.out.println("Result is " + res);
		}catch(NumberFormatException nfe){
			System.out.println("you tried dividing number by char " + nfe.getMessage());
		}catch(ArithmeticException ae){
			System.out.println("Hey pls dont divide by zero " + ae.getMessage());
		}catch(Exception e){
			System.out.println("Exception Occured : " + e);
		}finally{
			System.out.println("hey i'm always ther for you... ");
		}
		
		System.out.println("There is something more goes here ");
	}
}










