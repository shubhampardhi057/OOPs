package com.prowings.abstraction;

public class I_impl implements I {
	
        public void m1() {
			System.out.println("inside m1()");
		}

		public int m2() {
			System.out.println("inside m2()");
			return 0;
		}

		public String m3() {
			System.out.println("inside m3()");
			return null;
		}
		public static void main(String[] args) {
			
			I_impl obj = new I_impl();
			
			obj.m1();
			obj.m2();
			obj.m3();
		}
		

	}


