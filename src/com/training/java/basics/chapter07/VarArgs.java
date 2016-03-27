package com.training.java.basics.chapter07;

public class VarArgs {
	public static void main(String[] args) {
		// Notice how how vaTest() can be called with a
		// variable number of arguments.
		vaTest(10); // 1 arg
		vaTest(1, 2, 3); // 3 args
		vaTest(); // no args
	}

	// vaTest() now uses a vararg.

	/*
	 * A variable-length argument is specified by three periods (...). For
	 * example, here is how vaTest( ) is written using a vararg: static void
	 * vaTest(int ... v) {
	 */
	static void vaTest(int... v) {
		System.out.print("Number of args: " + v.length + " Contents: ");

		for (int x : v)
			System.out.print(x + " ");

		System.out.println();
	}

}
