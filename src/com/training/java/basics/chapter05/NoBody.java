// The target of a loop can be empty.

package com.training.java.basics.chapter05;

public class NoBody {

	public static void main(String[] args) {
		int i, j;

		i = 100;
		j = 200;

		// find midpoint between i and j.
		while (++i < --j)
			; // no body in the loop

		System.out.println("Midpoint is " + i);
	}

}
