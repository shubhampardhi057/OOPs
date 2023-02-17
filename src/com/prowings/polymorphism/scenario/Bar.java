package com.prowings.polymorphism.scenario;

public class Bar extends Foo {
	
	int x = 5;
	
	void m1() {
		System.out.println("x = "+x);
	}
	
	
	public static void main(String[] args) {
		
		Foo f = new Bar();
		
		
		f.m1();
	}

}
