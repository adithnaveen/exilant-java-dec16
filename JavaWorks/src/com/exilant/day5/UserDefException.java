package com.exilant.day5;


// this becomes checked exception 
class ExilantException extends Exception{
	String msg; 
	ExilantException(){
		this.msg = "Exception Occured... ";
	}
	ExilantException(String msg){
		this.msg = msg;
	}
	
//	ExilantException(String msg, Throwable obj){
//		this.msg = msg;
//	}
	@Override
	public String getMessage() {
		return this.msg;
	}
	@Override
	public String toString() {
		return "::::: " +this.msg;
	}
}


class InfyException extends Exception{
	String msg;
	
	InfyException(){
		this.msg ="Infy Exception Called... ";
	}
	InfyException(String msg){
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	@Override
	public String toString() {
		return "::::::" + msg;
	}
}


class IncomeTaxBL{
	public static void checkIncomeTax(String companyName, int sal, String name)
			throws ExilantException, InfyException{
		
		
		if(companyName.equalsIgnoreCase("exilant") && sal < 25000){
			throw new ExilantException("Your IT not processed plese check with "
					+ "company since Salary quoted  " + sal +" Mr/Ms/Mrs: " + name);
		}else if(companyName.equalsIgnoreCase("infy") && sal < 30000){
			throw new InfyException("Your IT not processed plese check with "
					+ "company since Salary quoted  " + sal +" Mr/Ms/Mrs: " + name);
		}else{
			System.out.println("We dont knwo which company u r working in!!!!");
		}
	}
}

public class UserDefException {
	public static void main(String[] args) {
		try {
			IncomeTaxBL.checkIncomeTax("exilant", 2000, "Harsha");
		} catch (ExilantException e) {
			e.printStackTrace();
		} catch (InfyException e) {
			e.printStackTrace();
		}
	}
}





















