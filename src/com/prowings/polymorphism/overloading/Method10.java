package com.prowings.polymorphism.overloading;

public class Method10 {
	
	public void m1(Integer a,Number b) {
		
		System.out.println("Integer a,Number a method");
	}
	public void m1(Integer a) {
		
		System.out.println("Integer a method");
	}
	public void m1(Number a) {
		
		System.out.println("Number a method");
	}
	public void m1(Object a) {
		
		System.out.println("Object a method");
	}

}
