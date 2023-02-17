package com.prowings.polymorphism.scenario;

public class P2 extends Shubham2 {
	
	public final void m1() {
		
		System.out.println("m1 method child");
	}
	
	public static void main(String[] args) {
		
		P2 p = new P2();
		
		p.m1();
		
		Shubham2 s = new Shubham2();
		
		s.m1();
		
		
	}
}


