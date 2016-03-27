// This program creates a custom exception type.

package com.training.java.basics.chapter10;

public class MyException extends Exception {
	private int detail;

	public MyException(int a) {
		detail = a;
	}

	@Override
	public String toString() {
		return "MyException [detail=" + detail + "]";
	}
}
