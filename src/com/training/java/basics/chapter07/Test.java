// Objects may be passed to methods.

package com.training.java.basics.chapter07;

public class Test {
	int a; // default access
	public int b; // public access
	private int c; // private access

	public Test() {
		a = a;
		b = b;
	}

	public Test(int i) {
		a = i;
	}

	public Test(int i, int j) {
		a = i;
		b = j;
	}

	// return true if o is equal to the invoking object
	boolean equals(Test o) {
		if (o.a == a && o.b == b) {
			return true;
		} else
			return false;
	}

	int getc() {
		// get c's value
		return c;
	}

	// Returning an object.
	// A method can return any type of data, including class types that you
	// create.
	Test incrByTen() {
		Test temp = new Test(a + 10);
		return temp;
	}

	// Primitive types are passed by value.
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}

	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}

	// methods to see
	void setc(int i) {
		// set c's value
		c = i;
	}
}
