// A simple example of the switch.

package com.training.java.basics.chapter05;

public class SampleSwitch {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i in one.");
				break;
			case 2:
				System.out.println("i in two.");
				break;
			case 3:
				System.out.println("i in three.");
				break;
			default:
				System.out.println("i is greater than 3.");
			}
		}

	}

}
