// A simple example of inheritance.

package com.training.java.basics.chapter08;

//Create a superclass.
public class A {
	int i;
	int j;

	// private int j;
	// A class member that has been declared as private will
	// remain private to its class. It is not accessible by any
	// code outside its class, including subclasses.
	public A() {
		System.out.println("Inside A's constructor.");
	}

	A(int a, int b) {
		i = a;
		j = b;
	}

	// Method overriding.
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}

	void showij(int x, int y) {
		i = x;
		j = y;
	}
}
