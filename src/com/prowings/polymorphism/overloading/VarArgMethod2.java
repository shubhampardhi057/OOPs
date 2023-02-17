package com.prowings.polymorphism.overloading;

public class VarArgMethod2 {
	
	public static void m1(int...numbers) {
		
		System.out.println("inside m1(int...numbers) method");
	}
	
	public static void m1(long[] numbers) {
		
		System.out.println("inside m1(long[]...numbers) method");
	}
	
	public static void main(String[] args) {
		
	 
		long[] val = {10l,20l,30l};
		
		m1(val);
	}

}
