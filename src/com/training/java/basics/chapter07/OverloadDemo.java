// Demonstrate method overloading.

package com.training.java.basics.chapter07;

public class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}

	// overload test for double parameter
	/*
	 * double test(double a) { System.out.println("double a: " + a); return a *
	 * a; }
	 */

	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}

	// Overload test for one integer parameter.
	void test(int a) {
		System.out.println("a: " + a);
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

}