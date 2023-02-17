package com.prowings.polymorphism.overloading;

public class Method8 {
	
	public void m1(Integer a) {
		
		System.out.println("m1 Integer a");
	}
	
	
	public void m1(Number a) {
		
		System.out.println("m1 Number a");
	}
	
	public void m1(Character a) {
		
		System.out.println("m1 Character a");
	}
	
	public void m1(Object a) {
		
		System.out.println("m1 Object a");
	}
	public void m1(Long a) {
		
		System.out.println("m1 Long a");
	}

	
}
