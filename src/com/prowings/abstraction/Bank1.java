package com.prowings.abstraction;


	class Bank1 {
		
		public static void main(String[] args) {
			Bank b;
			
			b =new SBI();
			System.out.println("rate of interest:= "+ b.getRateOfInterest()+" % ");
			
			
			b =new PNB();
			System.out.println("rate of interest:= "+ b.getRateOfInterest()+" % ");
		}
	}

