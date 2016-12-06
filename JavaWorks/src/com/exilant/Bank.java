package com.exilant;

public class Bank {

	private int bankId;
	private String bankName;
	private double asset;
	
	
	// compiler given constructor 
	public Bank(){
		// as good as saying new Object()
		super();
	}
	
	
	// getters and setters 
	
	@Override
	public String toString() {
		return this.bankId +", " + this.bankName +", " + this.asset;
	}

	@Override
	protected void finalize() throws Throwable {
		// you can write some code to nullify 
		/// imagine this is like destructor in C++ 
		// this will be the last method to be invoked 
		System.out.println("Hi i'm From Finalize... ");
	}


	// setters 
	public void setBankId(int bankId){
		this.bankId = bankId;
	}
	
	public void setBankName(String bankName){
		if(bankName.length() < 4){
			System.out.println("Sorry Name cannot be less than 4 chars");
			this.bankName = "NO NAME";
		}else{
			this.bankName =  bankName;
		}
	}
	
	public void setAsset(double asset){
		if(asset < 50000){
			System.out.println("Sorry Asset cannot be less than 50,000/-");
			this.asset = 50000;
		}else{
			this.asset = asset;
		}
	}
	
	// getters 
	public int getBankId(){
		return bankId;
	}
	
	public String getBankName(){
		return bankName;
	}
	
	public double getAsset(){
		return asset;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

