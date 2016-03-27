// Demonstrate the generic class.

package com.training.java.basics.chapter14;

public class GenDemo {

	public static void main(String[] args) {
		// Create a Gen reference for Integers.
		Gen<Integer> iob;

		// Create a Gen<Integer> object and assign its
		// reference to iOb. Notice the use of autoboxing
		// to encapsulate the value 88 within an Integer object.
		iob = new Gen<Integer>(88);

		// Show the type of data used by iOb.
		iob.showType();

		// Get the value in iOb. Notice that
		// no cast is needed.
		int v = iob.getob();
		System.out.println("Value v: " + v);
		int u = iob.getob().intValue();
		System.out.println("Value u: " + u);

		System.out.println();

		// Create a Gen object for Strings.
		Gen<String> strOb = new Gen<String>("Generics Test");

		// Show the type of data used by strOb.
		strOb.showType();

		// Get the value of strOb. Again, notice
		// that no cast is needed.
		String str = strOb.getob();
		System.out.println("Value: " + str);

		String str1 = strOb.getob().toString();
		System.out.println("Value: " + str1);
	}

}
