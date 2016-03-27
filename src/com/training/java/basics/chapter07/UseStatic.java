// Demonstrate static variables, methods, and blocks.

package com.training.java.basics.chapter07;

public class UseStatic {
	static int a = 3;
	static int b;

	static {
		System.out.println("Static block initilized.");
		b = a * 4;
	}

	public static void main(String[] args) {
		meth(42);
	}

	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
