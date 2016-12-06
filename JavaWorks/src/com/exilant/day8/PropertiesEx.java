package com.exilant.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	
	public static void storeProperty() throws IOException{
		Properties prop = new Properties();
		prop.setProperty("username", "root");
		prop.setProperty("password", "mypassword");
		
		FileWriter fw = new FileWriter("db.properties");
		prop.store(fw, "DB Properties");
		
		fw.close();
		System.out.println("Properties stored... ");
		
		
	}
	public static void getProperty() throws IOException{
		Properties prop = new Properties();
		FileReader fr = new FileReader("db.properties");
		
		prop.load(fr);
		
		System.out.println("username : "+ prop.getProperty("username"));
		System.out.println("password : " + prop.getProperty("password"));
		System.out.println("host : " + prop.getProperty("host", "localhost"));
		
	}
	
	
	public static void main(String[] args) throws IOException{
		//storeProperty();
		getProperty();
	}
	
}






















