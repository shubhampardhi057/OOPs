package com.prowings.polymorphism.overloading;

public class TestOverloading6 {
	
	
	public static void main(String[] args) {
		
		Method6 obj = new Method6();
		
		Integer i = 10;
		String s = "abc";
		
		obj.m1(i);
		obj.m1(s);
	}

}

