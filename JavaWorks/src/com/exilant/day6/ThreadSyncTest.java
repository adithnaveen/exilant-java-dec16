package com.exilant.day6;



class Account{
	int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	
	public void withdraw(int amount){
		if(amount < balance){
			// we have amount and can we withdrawn
			// for transaction to simulate will we sleep for 1 sec 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			balance = balance - amount;
			System.out.println("Amt Req : " + amount +" by " + Thread.currentThread().getName()
						+" Remaining is " + balance);
		}else{
			// no balance 
			System.out.println("Sorry "  + Thread.currentThread().getName() +" No Balance for Req Amt " + 
			amount);
		}
	}
	
	
}



public class ThreadSyncTest implements Runnable {

	Account account;
	int amt;

	ThreadSyncTest(String name, int amount, Account account){
		this.account = account;
		this.amt = amount;
		
		Thread t = new Thread(this, name);
		// will create a OS level thread and call run method 
		t.start();
	}
	
	@Override
	public void run() {
		
		synchronized (account) {
			account.withdraw(amt);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// assuming that this value 1000 will come from DB 
		Account account = new Account(1000);
		new ThreadSyncTest("Mr. A", 500, account);
		new ThreadSyncTest("Mr. B", 750, account);
	}


}




























