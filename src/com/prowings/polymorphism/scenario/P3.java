package com.prowings.polymorphism.scenario;

public class P3 {
	
	public final void m1() {
		System.out.println("m1 method P3");
	}
	synchronized void m2(char c) {
		System.out.println("m2 method P3 ");
	}
	
	public static void main(String[] args) {
		
		P3 p =new P3();
			
		p.m1();
		p.m2('c');
		
	}

}
