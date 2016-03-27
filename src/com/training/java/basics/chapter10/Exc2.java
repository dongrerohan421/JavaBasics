package com.training.java.basics.chapter10;

public class Exc2 {

	public static void main(String[] args) {
		int d, a;

		try {
			// monitor a block of code.
			d = 0;
			a = 42 / d;
			System.out.println("This will not be printed.");
		} catch (ArithmeticException e) {
			// catch divided-by-zero error
			System.out.println("Error: Division by zero.");
		}
		System.out.println("After catch statement.");
	}

}
