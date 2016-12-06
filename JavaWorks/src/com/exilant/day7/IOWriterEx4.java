package com.exilant.day7;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class IOWriterEx4 {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		String msg = "hello world!!!";
		
		osw.write(msg, 3, 5);
		
		osw.close();
	}
}
