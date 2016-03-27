// Demonstrate finally.

package com.training.java.basics.chapter10;

public class FinallyDemo {
	public static void main(String[] args) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Exception caught.");
		}
		procB();
		procC();
	}

	// Through an exception out of the method.
	static void procA() {
		try {
			System.out.println("Inside proA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("procA's finally.");
		}
	}

	// Return from within a try block.
	static void procB() {
		try {
			System.out.println("Inside procB.");
			return;
		} finally {
			System.out.println("procB's finally.");
		}
	}

	// Execute a try block normally.
	static void procC() {
		try {
			System.out.println("Inside procC.");
		} finally {
			System.out.println("procC's finally.");
		}
	}

}
