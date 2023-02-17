package com.prowings.inheritance;

public class Author {
	
	String autherName;
	int age;
	String place;
	
	public Author() {
		super();
	}

	public Author(String autherName, int age, String place) {
		super();
		this.autherName = autherName;
		this.age = age;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Author [autherName=" + autherName + ", age=" + age + ", place=" + place + "]";
	}
	
	

}
