// A simple example of recursion.

package com.training.java.basics.chapter07;

public class Factorial {
	// this is recursive method
	int fact(int n) {
		int result;

		if (n == 1)
			return 1;

		result = fact(n - 1) * n;
		return result;

	}
}