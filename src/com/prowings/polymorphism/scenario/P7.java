package com.prowings.polymorphism.scenario;

public class P7 extends Shubham7 {
	
	void m1(double d) {
		
		System.out.println("m1 method double");
	}
	
	public static void main(String[] args) {
		
		P7 p = new P7();
		
		p.m1(1);
		p.m1(null);
		
		
		
	}

}
