package com.exilant.day6;


class Doll extends Thread{
	public void run(){
		while(true){
			System.out.println("Doll Says Hi!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class DeamonEx {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Doll d  = new Doll();
		d.setDaemon(true);
		d.start();
		
		char [] chars = "hello".toCharArray();
		for(int i=0; i<chars.length; i++){
			System.out.println(chars[i]);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}




















