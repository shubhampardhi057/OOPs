package com.prowings.polymorphism.overloading;

public class VarArgMethod {

	public static void m1(int...numbers) {
		
		System.out.println("inside (int...numbers) method");
		
	}
	public static void m1(long...numbers) {
		
		System.out.println("inside (long...numbers) method");
		
	}
	public static void main(String[] args) {
		
		int x = 30;
		int y = 40;
		int z = 70;
		m1(x,y,z);
	}
	
}
