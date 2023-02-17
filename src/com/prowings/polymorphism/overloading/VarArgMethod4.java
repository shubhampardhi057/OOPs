package com.prowings.polymorphism.overloading;

public class VarArgMethod4 {

	
	public static void test(int[] intArr) {
		System.out.println("int array");
	}
	
	public static void test(long[] intArr) {
		System.out.println("long array");
	}
	
	public static void test(char[] intArr) {
		System.out.println("char array");
	}
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		test(nums);
		
	}
}
