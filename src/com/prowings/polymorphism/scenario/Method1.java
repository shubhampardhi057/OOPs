package com.prowings.polymorphism.scenario;

public class Method1 {

//		public void method(Object i) {
//			System.out.println("Object");
//		}

		public void method(String i) {
			System.out.println("String");
		}

//		public void method(StringBuffer i) {
//			System.out.println("StringBuffer");
//		}

//		public void method(StringBuilder i) {
//			System.out.println("StringBuilder");
//		}

		public static void main(String[] args) {

			Method1 t = new Method1();
			
			 t.method(null);
			
			t.method(new String("hi"));
		}

	}

