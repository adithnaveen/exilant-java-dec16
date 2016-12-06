package com.exilant.day5;

class MyBusiness implements Runnable{
	Thread thread;
	
	
	public MyBusiness(){}
	
	// java have priority ranging from 1-10 
	// MIN  -> 1, NORM -> 5, MAX -> 10 
	public MyBusiness(String threadName, int priority) {
		thread = new Thread(this, threadName);
		thread.setPriority(priority);
		
		// this statement will create a OS level thread and 
		// call run method 
		thread.start();
		
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("i value is " + i +" in " + 
					Thread.currentThread().getName() +" with priority " + 
					Thread.currentThread().getPriority());
		}
		System.out.println("Exiting -> " + Thread.currentThread().getName());
	}
	
}


public class RunnableEx1 {
	public static void main(String[] args) {
		MyBusiness mb1 = new MyBusiness("Harsha", Thread.NORM_PRIORITY);
		MyBusiness mb2 = new MyBusiness("Ashwini", Thread.MAX_PRIORITY);
		MyBusiness mb3 = new MyBusiness("Vinod", Thread.MIN_PRIORITY);
		
		
		Thread t1 = new Thread(new MyBusiness());
		t1.setName("Scott");
		t1.setPriority(8);
		t1.start();
		
	}	
}



















