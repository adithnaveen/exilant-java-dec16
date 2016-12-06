package com.exilant.day4;

import java.util.Arrays;

public class PrimitiveSortEx {
	public static void main(String[] args) {
		int [] nums = {22,11,32,44,66, 21};
		
		Arrays.sort(nums);
		
		for(int temp : nums){
			System.out.println(temp);
		}
		
		/////////////////////////
		String [] sarr = {"scott", "harry", "peter", "king", "tim"};
		
		Arrays.sort(sarr);

		for(String temp : sarr){
			System.out.println(temp);
		}
		
		
		
		
	}
}
