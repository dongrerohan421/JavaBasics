/*
 * Here, Box defines three constructors to initialize the dimensions of
 * a box various ways.
 * */
package com.training.java.basics.chapter07;

public class Box {
	double depth;
	double height;
	double width;

	// constructor used when no dimensions specified
	public Box() {
		width = -1; // use -1 to indicate
		height = -1; // uninitialized
		depth = -1; // box
	}

	// Notice this constructor. It takes an object of type Box.
	Box(Box ob) {
		// pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when cube is created
	public Box(double len) {
		width = height = depth = len;
	}

	// constructor used when all dimensions specified
	public Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}
