package com.training.java.basics.chapter07;

public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		// double result;
		int i = 88;

		// call all versions of test
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		// result = ob.test(123.25);
		// System.out.println("Result of ob.test(123.25): " + result);

		ob.test(i);
		ob.test(123.2);
	}

}
