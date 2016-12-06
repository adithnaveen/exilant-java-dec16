package com.exilant.day7;

import java.io.File;

public class IOFileEx3 {
	public static void main(String[] args) {
		// this will refer to directory 
		// file object can hold directory or file 
		// both behaves the same, except file will hold the content 
		// directory will hold the reference of the file or another directory  
		File file = new File("sample");
		
		if(file.isDirectory()){
			// go ahead and try getting all the files 
			String [] names = file.list();
			for(String temp : names){

				File f1 = new File(file, temp);
				if(f1.isFile()){
					System.out.println(temp);
				}
			}
			
		}else{
			System.out.println("Given file is not a directory");
		}
	}
}
