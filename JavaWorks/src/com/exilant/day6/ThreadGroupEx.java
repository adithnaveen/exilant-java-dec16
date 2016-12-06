package com.exilant.day6;

class Dummy implements Runnable {
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName() +" value is " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadGroupEx {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Group-1");
		Thread t1 = new Thread(tg, new Dummy(), "G1-Pavithra");
		t1.setPriority(8);
		System.out.println("T1 priority is " + t1.getPriority());
		t1.start();
		Thread t2 = new Thread(tg, new Dummy(), "G1- Avinash");
		t2.start();
		Thread t3 = new Thread(tg, "G1- Swathi");
		
		ThreadGroup tg1 = new ThreadGroup("Group-2");
		Thread t4 = new Thread(tg1, "G2-Lakshmi");
		Thread t5 = new Thread(tg1, "G2-Vedashree");
		
		System.out.println(tg.activeCount());
		tg.setMaxPriority(5);
		tg1.setMaxPriority(7);
		
		tg.list();
		tg1.list();
		
	}
}










