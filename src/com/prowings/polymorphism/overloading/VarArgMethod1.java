package com.prowings.polymorphism.overloading;

public class VarArgMethod1 {
	
	public static void m1(int...numbers) {                      //var-arg method
		
		System.out.println("inside (int...numbers) method");
		
		int res = 0;
		
		for(int i= 0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
			res += numbers[i];
		}
		System.out.println("addition of var args is :"+ res);
		
	}
    public static void main(String[] args) {
	
    	m1(20,30,40);
		
	}
}
