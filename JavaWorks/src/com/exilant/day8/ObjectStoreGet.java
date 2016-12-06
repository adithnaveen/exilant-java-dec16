package com.exilant.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	private int accId;
	transient private double accBalance;
	private String custName;
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accBalance=" + accBalance + ", custName=" + custName + "]";
	}
	
	
	public Account(int accId, double accBalance, String custName) {
		super();
		this.accId = accId;
		this.accBalance = accBalance;
		this.custName = custName;
	}
	
	
	
}




public class ObjectStoreGet {
	
	public static void storeObject(Account account) throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Account.ser"));
		
		oos.writeObject(account);
		oos.writeInt(100);
		
		oos.close();
		System.out.println("Data Written Successfully....");
	}
	
	
	public static void getObject() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Account.ser"));
		
		Account account = (Account) ois.readObject();
		int val = ois.readInt();
		System.out.println(val);
		System.out.println(account);
	}
	
	
	
	
	public static void main(String[] args) {
		Account account = new Account(101, 2000, "kumar");
		try {
			// storeObject(account);
			getObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException cce){
			cce.printStackTrace();
		}
	}
	
}


















