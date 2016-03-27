// Demonstrate TwoGen.

package com.training.java.basics.chapter14;

public class SimpGen {

	public static void main(String[] args) {

		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
		TwoGen<Integer, Integer> tgObj1 = new TwoGen<Integer, Integer>(88, 54);

		// Show the types.
		tgObj.showType();

		// Obtain and show values.
		int v = tgObj.getob1();
		System.out.println("Value of v: " + v);

		String str = tgObj.getob2();
		System.out.println("Value of str: " + str);

		// Show the types.
		tgObj1.showType();
		int u = tgObj1.getob1();
		System.out.println("Value of u: " + u);

		int w = tgObj1.getob2();
		System.out.println("Value of w: " + w);
	}

}
