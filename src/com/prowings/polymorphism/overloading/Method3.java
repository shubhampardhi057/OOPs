package com.prowings.polymorphism.overloading;

public class Method3 {
	
	public int sub(int a,int b) {
		
		System.out.println(a-b);
		return a-b;
		
	}
	public int sub(int a,int b,int c) {
		
		System.out.println((a-b)-c);
		return ((a-b)-c);
		
	}

}
