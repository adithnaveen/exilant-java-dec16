package com.exilant.day5;

import java.util.Scanner;

public class InterrupEx extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("Hello How are you... ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	// now this class is eligible to be threaded 
	// i.e., there will 1 thread by main and you can create more threads 
	public static void main(String[] args) {
		InterrupEx ie = new InterrupEx();
		ie.start();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something to stop...");
		String val = sc.next();
		
		if(val != null){
			ie.interrupt();
			System.out.println("Hey stopped... ");
		}
	}
}

















