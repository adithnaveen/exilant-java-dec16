package com.exilant.day4;

class Chair{
	private int len;
	private int bre;
	
	
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return this;
		
		Chair newChair = new Chair();
		newChair.setLen(this.len);
		newChair.setBre(this.bre);
		return newChair;
	}

	@Override
	public String toString() {
		return "Chair [len=" + len + ", bre=" + bre + "]";
	}
	
	
	
}


public class CloneEx1 {
	public static void main(String[] args) 
			throws CloneNotSupportedException {

		Chair chair1 = new Chair();
		chair1.setLen(10);
		chair1.setBre(20);
		
		System.out.println("Chair1 " + chair1);
		
		Chair chair2 = (Chair) chair1.clone();
		System.out.println("Chair2 " + chair2);
		
		chair1.setLen(23);
		System.out.println("Chair2 " + chair2);
		System.out.println("Chair1 - Again " + chair1);
		
	}
}












