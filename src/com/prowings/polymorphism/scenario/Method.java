package com.prowings.polymorphism.scenario;

public class Method {
	
		public void method(Object i) {
			System.out.println("Object");
		}

//		public void method(String i) {
//			System.out.println("String");
//		}

//		public void method(Integer i) {
//			System.out.println("Integer");
//		}

		public void method(Float i) {
			System.out.println("Float");
		}

		public void method(Number i) {
			System.out.println("Number");
		}

		public static void main(String[] args) {

			Method m = new Method();
			
			m.method(null);
		}

	}


