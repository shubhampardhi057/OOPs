package com.prowings.polymorphism.scenario;

 public class Scenario {
	
	public void get() {
		
		System.out.println("a");
	}
	
	public int get(int a) {
		
		System.out.println("int a");
		return 10;
	}
}
 class Scenario1  extends Scenario {
	 
//	 private void get() {
//		 System.out.println("b");
//	 }
	 
	 public int get(int b) {
		 System.out.println("int b");
		 return 20;
	 }
 }
 class TestScenario {
	 
	 public static void main(String[] args) {
		
		 Scenario1 s = new Scenario1();
		 
		 s.get();
	}
 }
