package com.exilant.day3;

/**
 * 
 * @author trainee Write a java program to accept details of the employee and
 *         show the output in the below fashion I/P : 2 101 Kumar 4000 400 300
 *         80 Engineer 102 Surya 5000 TL (this can be any list ) O/P: Emp Id :
 *         101 Emp Name : Kumar Emp Sal : 4780 Emp Desig : Engineer Emp Hike :
 *         300 New Salary : 5080
 * 
 * 
 */

class Hike {
	private int hike;
	private String desig;

	public Hike(int hike, String desig) {
		super();
		this.hike = hike;
		this.desig = desig;
	}

	public int getHike() {
		return hike;
	}

	public void setHike(int hike) {
		this.hike = hike;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

}

public class EmployeeCmdLine {

	
	public int getHike( String desig){
		for(Hike temp : hikes){
			if(temp.getDesig().equalsIgnoreCase(desig)){
				return temp.getHike();
			}
		}
		return 0;
	}
		
	
	Hike hikes[] = new Hike[] { 
					new Hike(300, "Engineer"),
					new Hike(600, "TL") , 
					new Hike(900, "PM")
				};
		
	public static void main(String[] args) {
	
		// For each employee there shall be 7 entries if it fails 
		// then the program is stopped 
		
		int noOfEmps = Integer.parseInt(args[0]);
		
		if((args.length-1) == (noOfEmps * 7)){
			System.out.println("Total Number of Employees to be processed " + 
					noOfEmps);
		}else{
			System.out.println("Sorry Invalid Number of arguments");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
