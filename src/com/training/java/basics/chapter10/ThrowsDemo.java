// This program contains an error and will not compile.

package com.training.java.basics.chapter10;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			throwone();
		} catch (IllegalAccessException e) {
			System.out.println("Caught: " + e);
			e.printStackTrace();
		}
	}

	static void throwone() throws IllegalAccessException {
		System.out.println("Inside throwone.");
		throw new IllegalAccessException("demo");
	}

}
