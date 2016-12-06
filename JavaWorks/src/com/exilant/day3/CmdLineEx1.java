package com.exilant.day3;

public class CmdLineEx1 {
	public static void main(String[] args) {
		System.out.println("number of parameters passed is " + args.length);
		
		for(int i=0; i<args.length; i++){
//		for(String temp : args){
			System.out.println(args[i] +" @ " + i);
		}
		
	}
}
