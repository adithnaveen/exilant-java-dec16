package com.exilant.day7;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class IOFileEx2 {
	public static void main(String[] args) throws IOException {
		// by doing this the file will not be created 
		File f = new File("sample.txt");
		
		System.out.println(File.separator);
//		boolean flag  = f.createNewFile();
//		System.out.println(flag?"CREATED":"Not CREATED");
		
		System.out.println("Absolute Path " + f.getAbsolutePath());
		System.out.println("Parent Directory " + f.getParent());
		System.out.println("Read Permission " + f.canRead());
		System.out.println("File exists " + f.exists());
		System.out.println("Length " + f.length());
		System.out.println("modified " + new Date(f.lastModified()));
		System.out.println("is directory " + f.isDirectory());
	}
}

















