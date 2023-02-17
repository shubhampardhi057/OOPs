package com.prowings.polymorphism.overloading;

public class VarArgMethod5 {

	public  void m1(int...num) {
		System.out.println("m1 (int...num)method");
	}
	
	public static void m1(Character...num) {
		System.out.println("m1 (Character...num)method");
	}
	
//	public  void m1(Integer...num) {
//		System.out.println("m1 (Integer...num)method");
//	}
	
	public static void main(String[] args) {
//		Integer i=10;
//		m1(i);
//		m1(10,20);
//		m1('s');
		
	}
}
