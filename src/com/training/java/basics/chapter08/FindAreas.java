package com.training.java.basics.chapter08;

public class FindAreas {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Traingle t = new Traingle(10, 8);

		Figure figuref;

		figuref = r;
		System.out.println("Area is " + figuref.area());

		figuref = t;
		System.out.println("Area is " + figuref.area());

		figuref = f;
		System.out.println("Area is " + figuref.area());
	}

}
