package com.prowings.polymorphism.overloading;

public class VarArgMethod3 {
	
//	public static void m1(int...numbers) {
//		System.out.println("inside m1(int...numbers)method");
//	}
	
//	public static void m1(long...numbers) {
//		System.out.println("inside m1(long...numbers)method");
//	}
	public static void m1(Integer...numbers) {
		System.out.println("inside m1(Integer...numbers)method");
	}
//	public static void m1(Long...numbers) {
//		System.out.println("inside m1(Long...numbers)method");
//	}

//	public static void m1(int num1) {
//		System.out.println("inside m1(int num1)method");
//	}
	
//	public static void m1(long num1) {
//		System.out.println("inside m1(long num1)method");
//	}
	
//	public static void m1(Integer num1) {
//		System.out.println("inside m1(Integer num1)method");
//	}
	public static void m1(char...num1) {
		System.out.println("inside m1(char...num1)method");
	}
	public static void m1(int...num1) {
		System.out.println("inside m1(int...num1)method");
	}
	
	public static void main(String[] args) {
		
		m1('a');
		
//		Integer i= 10,j =20;

//		m1(i,j);
		
		
	}
	
	
}
