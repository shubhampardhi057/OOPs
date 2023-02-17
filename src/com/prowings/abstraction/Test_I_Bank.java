package com.prowings.abstraction;

public class Test_I_Bank {

	
	public static void main(String[] args) {
		
		ICICI obj = new ICICI();
		
		BOM obj1 =new BOM();
		
		obj.rateOfInterest();
		
		obj1.rateOfInterest();
		
		System.out.println("ROI: "+obj.rateOfInterest());  
		System.out.println("ROI: "+obj1.rateOfInterest());  
		}
}
