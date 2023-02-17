package com.prowings.polymorphism.scenario;

import java.io.IOException;

public class Shubham0 {

	void color(char r) throws IOException {
		System.out.println("Red");
	}
}

class P33 extends Shubham0 {
	void color(char m) throws IOException {
		System.out.println("Orange");
	}
}

class P44 extends P33 {
	@Override
	final void color(char s) throws IOException {
		System.out.println("Yellow");
	}
}
