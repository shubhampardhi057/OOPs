package com.prowings.polymorphism.scenario;

public class P8 extends Shubham8 {
	
	protected String m2()
	{ 
	 System.out.println("Three"); 
	  return null; 
	 } 
	
	
	public static void main(String[] args) {
		
		P8 p = new P8();
		
		p.m1(20);
		p.m2();
		
	}

}
