// Use break with a for-each style for.

package com.training.java.basics.chapter05;

public class ForEach2 {

	public static void main(String[] args) {
		int sum = 0;
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int x : num) {
			System.out.println("Value is: " + x);
			sum += x;
			if (x == 5)
				break;
		}
		System.out.println("Summation of first 5 elements: " + sum);
	}

}
