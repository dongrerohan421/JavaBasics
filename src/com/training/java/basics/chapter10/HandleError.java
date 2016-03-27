// Handle an exception and move on.

package com.training.java.basics.chapter10;

import java.util.Random;

public class HandleError {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Random r = new Random();

		for (int i = 0; i < 32000; i++) {
			try {
				b = r.nextInt();
				System.out.println("b: " + b);
				c = r.nextInt();
				System.out.println("c: " + c);
				a = 12345 / (b / c);
				System.out.println("a in for: " + a);
			} catch (ArithmeticException e) {
				System.out.println("Error: Division-by-zero.");
				a = 0; // set a to zero and continue
			}
			System.out.println("a: " + a);
		}
	}

}
