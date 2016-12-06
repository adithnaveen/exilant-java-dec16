package com.exilant.day7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOWriterEx5 {
	public static void main(String[] args) throws IOException {
		File file = new File("sample.txt");
		
		FileWriter fw = new FileWriter(file, true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello World");
		bw.newLine();
		bw.write("Hello India");
		
		bw.close();

		System.out.println("Data Written Successfully");
		
	}
}
















