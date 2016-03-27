//This program will not compile

package com.training.java.basics.chapter03;

public class ScopeErr {

	public static void main(String[] args) {
		int bar = 1;
		{ // creates new scope
			int bar = 2; // compile-time error - bar already defined
		}
	}

}
