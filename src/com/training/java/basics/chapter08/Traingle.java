package com.training.java.basics.chapter08;

public class Traingle extends Figure {

	public Traingle(double a, double b) {
		super(a, b);
	}

	// override area for right triangle
	@Override
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}
