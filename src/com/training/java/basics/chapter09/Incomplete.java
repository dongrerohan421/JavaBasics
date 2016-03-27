// If a class includes an interface but does not fully implement the methods defined by that interface,
// then that class must be declared as abstract.

package com.training.java.basics.chapter09;

public abstract class Incomplete {
	int a, b;

	void show() {
		System.out.println(a + " " + b);
	}

	/*
	 * Here, the class Incomplete does not implement callback( ) and must be
	 * declared as abstract. Any class that inherits Incomplete must implement
	 * callback( ) or be declared abstract itself
	 */
}
