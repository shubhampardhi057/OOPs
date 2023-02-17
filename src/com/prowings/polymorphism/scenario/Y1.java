package com.prowings.polymorphism.scenario;

public class Y1 extends X1 {
	
		public void m1(int i) {
			
			System.out.println("m1(int i) of Y");
		}
		
		public static void main(String[] args) {
			
			Y1 y = new Y1();
			
			y.m1();
			y.m1(10);
			
	}
}




