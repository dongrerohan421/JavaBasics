// This class holds an array of coordinate objects.

package com.training.java.basics.chapter14;

public class Coords<T extends TwoD> {
	T[] coords;

	public Coords(T[] o) {
		coords = o;
	}
}
