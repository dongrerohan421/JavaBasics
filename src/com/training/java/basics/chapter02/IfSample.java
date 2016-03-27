/*
 Demonstrate the IF
*/

package com.training.java.basics.chapter02;

public class IfSample {

	public static void main(String[] args) {
		int x, y;

		x = 10;
		y = 20;

		if (x < y)
			System.out.println("x is less than y.");

		x = x * 2;
		if (x == y)
			System.out.println("x is equal to y");

		x = x * 2;
		if (x > y)
			System.out.println("x is greater than y");

		// this won't display anything
		if (x == y)
			System.out.println("You won't see this");
	}

}