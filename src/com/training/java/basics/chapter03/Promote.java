/*
 * Demonstrate  how each value in the expression gets promoted to match
 * the second argument to each binary operator.
 * */

package com.training.java.basics.chapter03;

public class Promote {

	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * c);
		System.out.println((f * b) + " + " + (i / c) + " + " + (d * s));
		System.out.println("result = " + result);

	}

}
