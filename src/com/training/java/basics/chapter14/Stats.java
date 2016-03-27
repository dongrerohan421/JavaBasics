// Stats attempts (unsuccessfully) to
// create a generic class that can compute
// the average of an array of numbers of
// any given type.
//
// The class contains an error!

package com.training.java.basics.chapter14;

public class Stats<T extends Number> { // In this version of Stats, the type
										// argument for // T must be either
										// Number, or a class derived // from
										// Number.
	T[] num; // nums is an array of type T

	// Pass the constructor a reference to
	// an array of type T.
	public Stats(T[] o) {
		num = o;
	}

	// Return type double in all cases.
	double average() {
		double sum = 0.0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i].doubleValue(); // Error!!
			// System.out.println("sum: " + sum);
		}
		return sum / num.length;
	}

	boolean sameAvg(Stats<?> ob) {
		if (average() == ob.average())
			return true;
		return false;
	}
}
