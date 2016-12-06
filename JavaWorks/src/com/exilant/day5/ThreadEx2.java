package com.exilant.day5;

// if you want this class  eligible to be thread class 
// then extend from thread class 
class MyBusinessLogic extends Thread{
	// this method should be always overridden 
	// such that all business logic will go here
	
	// calling this method directly will not has any async behavior 
	public void run(){
		// TODO 
		// this is to simulate some time 
		for(int i=0; i<500; i++){
			System.out.println("i value is " + i +" in " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread " + Thread.currentThread().getName() +" Exiting");
	}
}


public class ThreadEx2 {
	public static void main(String[] args) {
		MyBusinessLogic mb1 = new MyBusinessLogic();
		MyBusinessLogic mb2 = new MyBusinessLogic();
		MyBusinessLogic mb3 = new MyBusinessLogic();
		
		// to call the business logic i.e., run method async 
		mb1.start();
		mb2.start();
		mb3.start();
		
		
		// we will make sure all children threads are joined 
		
		try {
			mb1.join();
			mb2.join();
			mb3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread exiting... ");
	}
}


















