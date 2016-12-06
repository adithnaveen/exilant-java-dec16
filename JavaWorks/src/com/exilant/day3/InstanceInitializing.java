package com.exilant.day3;

class Electronics {
	public Electronics() {
		System.out.println("In Constructor Electronics");
	}

	static {
		System.out.println("In Static block electornics");
	}

	{
		System.out.println("in instance block Electornics");
	}
}

class Mobile extends Electronics {
	public Mobile() {
		System.out.println("Constructor Mobile ");
	}

	static {
		System.out.println("In static mobile ");
	}

	{
		System.out.println("in instance mobile... ");
	}
}

public class InstanceInitializing {
	public static void main(String[] args) {
		new Mobile();
		System.out.println("--------------");
		new Mobile();
		
	}
}















