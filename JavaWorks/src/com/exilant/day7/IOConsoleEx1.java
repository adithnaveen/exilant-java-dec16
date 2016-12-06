package com.exilant.day7;

import java.io.Console;

public class IOConsoleEx1 {
	public static void main(String[] args) {
		Console console = System.console();
		String password = "india";
		
		if(console == null){
			System.out.println("Sorry Console not found...");
			System.exit(0);
		}else{
			System.out.println("Enter User Name :");
			String uName = console.readLine();
			System.out.println("Enter Password :");
			char [] usrPwd = console.readPassword();
			String userPwd = new String(usrPwd);
			
			if(userPwd.equals(password)){
				System.out.println("Welcome..." + uName);
			}else{
				System.out.println("Invalid Login Credentials... ");
			}
		}
	}
}














