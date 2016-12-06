package com.exilant.day3;

import java.util.Random;

class Account{
	private int accId;
	private String custName;
	private double balance;
	private String code;
	private static int accountCount;
	
	static{
		// here i can go and compute
		accountCount=100;
	}
	{
		// get the value from some resource and 
		// can be given to every constructor object 

		String [] splOffers ="discount:movieticket:shoppingcouponts".split(":");
		int x = (int) (Math.random() * 3);
		this.setCode(splOffers[x]);
		
	}
	Account(String custName, double balance){
		this.custName = custName;
		this.balance = balance;
		this.accId = accountCount ++;
	}
	
	Account(String custName){
		this.custName = custName;
		this.balance = 0;
		this.accId = accountCount ++;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public String getCustName() {
		return custName;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custName=" + custName + ", balance=" + balance + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}


public class AccountImpl {
	public static void main(String[] args) {
		
		Account accs [] = new Account[4];
		accs[0] = new Account("Pooja");
		accs[1] = new Account("Tharini", 500);
		accs[2] = new Account("Annapurna");
		accs[3] = new Account("Vineet", 3000);
		
		for(Account acc : accs){
			System.out.println(acc +", " + acc.getCode());
		}
		
		
	}
}
























