package com.prowings.polymorphism.overloading;

public class VarArgMethod6 {
	
	public static void m1(int...num) {
		
		System.out.println("int...num m1");
	}
	
	
	public static void main(String[] args) {
		
		Integer i= 10;
		
	     m1(i);	
		
		
	}

}
