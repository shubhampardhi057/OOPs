package com.prowings.polymorphism.scenario;

public class P5_2 extends P5_1 {
	
	void draw(int a, float b) throws ArithmeticException
	{ 
	 System.out.println("Square"); 
	 } 
	public static void main(String[] args) throws Throwable {
		
		Shubham5 s = new Shubham5();
		s.draw(20, 30.5f);  
		
		P5_1 p1 =  (P5_1)s;
		 p1.draw(10,2.9f); 
		
		P5_2 p2 = (P5_2)p1;
		 p2.draw(20, 30f); 
		
	}

}
