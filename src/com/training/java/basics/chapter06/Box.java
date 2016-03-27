/*
	A program that uses the Box class.
	Call this file BoxDemo.java
*/

package com.training.java.basics.chapter06;

public class Box {
	double depth;
	double height;
	double width;

	// This is the constructor for Box.
	public Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}

	/**
	 * @param depth
	 * @param height
	 * @param width
	 */
	public Box(double d, double h, double w) {
		this.depth = d;
		this.height = h;
		this.width = w;
	}

	//
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// compute and return volume
	double volume2() {
		return width * height * depth;
	}

	// display volume of a box
	void voulume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
}
