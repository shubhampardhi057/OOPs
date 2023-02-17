package com.prowings.polymorphism.overriding;

public class College2 extends College {
	
	
	public int rollno = 101;
	
	
	
	public static void main(String[] args) {
		
		College c = new College();
		
		College2 c1 = new College2();
		
	    System.out.println(c.name);
	    System.out.println(c1.rollno);
	 
		
	}
	
	

}
