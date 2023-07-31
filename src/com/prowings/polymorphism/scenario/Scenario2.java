package com.prowings.polymorphism.scenario;

public class Scenario2 {
	
	public  void m1(int...num) {
		System.out.println("int...num");
		
	}
	
	public  void m1(Integer...num) {
		System.out.println("Integer...num");
	}
	
	public static void main(String[] args) {
		
		Scenario2 s = new Scenario2();
		
		Integer [] num = {10,20,30};
		
		s.m1(num);
		
	}

}
