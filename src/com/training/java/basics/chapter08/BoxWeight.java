// Here, Box is extended to include weight.

package com.training.java.basics.chapter08;

public class BoxWeight extends Box {
	// String s;
	double weight;

	// Default constructor
	public BoxWeight() {
		super();
		weight = -1;
	}

	public BoxWeight(BoxWeight ob) {
		// pass object to constructor
		super(ob);
		weight = ob.weight;
	}

	// constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}

	// constructor
	public BoxWeight(double w, double h, double d, double m) {
		// width = w;
		// height = h;
		// depth = d;
		super(w, h, d); // call superclass constructor
		weight = m;
	}

}
