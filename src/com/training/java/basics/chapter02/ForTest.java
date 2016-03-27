/*
 * Demonstrate the for loop
 * */

package com.training.java.basics.chapter02;

public class ForTest {

	public static void main(String[] args) {
		int x;

		for (x = 0; x < 10; x++)
			System.out.println("This is x: " + x);

		for (x = 10; x > 0; x--)
			System.out.println("This is x: " + x);
	}

}
