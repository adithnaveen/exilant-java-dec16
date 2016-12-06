package com.exilant.day4;

import java.util.Arrays;

public class ComputerSorter {
	public static void main(String[] args) {
		Computer[] computers = {
				new Computer(101, "Apple", 33344), 
				new Computer(21, "Samsung", 12344), 
				new Computer(34, "LG", 34441), 
				new Computer(3, "Chrome", 24444), 
		};
		
		Arrays.sort(computers);
		for(Computer temp : computers){
			System.out.println(temp);
		}
		System.out.println("-------------- sort on id --------------- ");
		
		ComputerTemplateSorter.sortOnIdAsc(computers);
		
		for(Computer temp : computers){
			System.out.println(temp);
		}
		
		System.out.println("------------- Sort on Name Desc -------------------");
		ComputerTemplateSorter.sortOnNameDesc(computers);
		
		for(Computer temp : computers){
			System.out.println(temp);
		}
		System.out.println("=============================");
		System.out.println(
				computers[ComputerTemplateSorter.checkComputerName(computers, "LG")]);
		
		System.out.println("------------ finding computer object.... ");
		System.out.println(
					ComputerTemplateSorter.checkComputer(
					computers, new Computer(101, "Apple", 33344))>=0
					?"Found":"Not Found"
				);
	}
}
















