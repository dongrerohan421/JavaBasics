package com.training.java.basics.chapter08;

public class OverRide {

	public static void main(String[] args) {
		B subOb = new B(1, 2, 3);

		subOb.show("This is k: "); // this calls show() in B
		subOb.show(); // this calls show() in A

	}

}
