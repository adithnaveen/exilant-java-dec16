package com.exilant.day6;

import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("asia:america:africa:europe", ":");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
