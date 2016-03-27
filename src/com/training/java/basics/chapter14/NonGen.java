// NonGen is functionally equivalent to Gen
// but does not use generics.

package com.training.java.basics.chapter14;

public class NonGen {
	Object ob; // ob is now of type Object

	// Pass the constructor a reference to
	// an object of type Object
	public NonGen(Object o) {
		ob = o;
	}

	// Return type object.
	Object getob() {
		return ob;
	}

	// Show type of ob.
	void showType() {
		System.out.println("Type of ob is " + ob.getClass().getName());
	}
}
