// Create a subclass by extending class A.

package com.training.java.basics.chapter08;

/*
 * class subclass-name extends superclass-name {
 * // body of class }
 * */
public class B extends A {

	int i; // this i hides the i in A
	int k;

	B() {
		System.out.println("Inside B's constructor.");
	}

	B(int a, int b) {
		super.i = a; // i in A
		i = b; // i in B
	}

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// @Override
	/*
	 * @Override void show() { // System.out.println("i in superclass: " +
	 * super.i); // System.out.println("i in subclass: " + i); super.show();
	 * System.out.println("k: " + k); }
	 */

	@Override
	void show() {
		super.show();
		System.out.println("k: " + k);
	}

	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}
}
