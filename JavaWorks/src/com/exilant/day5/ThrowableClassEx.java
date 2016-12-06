package com.exilant.day5;

public class ThrowableClassEx {

	public static void checkLoginName(String name) throws Throwable{
		if(name.equals("hello")){
			System.out.println("Welcome ");
		}else{
			try {
			throw new Exception("hey wrong name");
			}catch(Exception e ){
				System.out.println("e is " + e);
				throw new Throwable("throw from Login Name"	, e);
			}
		}
	}
	
	
	public static void main(String[] args) {
		try {
			checkLoginName("somthing");
		} catch (Throwable e) {
			StackTraceElement[] ste = e.getStackTrace();
			
			for(StackTraceElement temp : ste){
				System.out.println("Class Name :" + temp.getClassName() +
								   ", Line Number :" + temp.getLineNumber() +
								   ", Method Name :" + temp.getMethodName());
			}
		}
		
	}
	
}











