package com.prowings.inheritance;

public class TestAggregation1 {
	
	public static void main(String[] args) {
		
		Author author =new Author("John", 42, "USA");
		
		Book b = new Book("Java For Beginer", 800,author);
		
		System.out.println(author);
		
		System.out.println(b);
	}

}
