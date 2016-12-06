package com.exilant.day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOWriterEx6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Emp.txt"));
		
		System.out.println("Enter Your name ");
		String name = br.readLine();
		
		System.out.println("Enter Your Salary ");
		double salary = Double.parseDouble(br.readLine());
		
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
		
		bw.write("Name : " + name);
		bw.write("Salary : " + salary );
		bw.close();
		System.out.println("Data Written... ");
		
	}
}











