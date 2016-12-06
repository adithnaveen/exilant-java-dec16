package com.exilant.day4;

public class AccountClient {
	public static void main(String[] args) {
		Account [] accs = new Account[4]; 
		
		accs[0] = new SBAccount();
		accs[1] = new CAccount();
		accs[2] = new SBAccountSeniorCitizen();
		accs[3] = new CAccount();
		
		for(Account temp : accs){
			temp.roi();
		}
		
	}
}
