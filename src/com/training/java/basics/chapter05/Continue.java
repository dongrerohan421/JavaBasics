// Demonstrate continue.

package com.training.java.basics.chapter05;

public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0) {
				System.out.print("if excecuted ");
				continue;
			}
			System.out.println("block excecuted");
			System.out.println("");
		}
	}

}
