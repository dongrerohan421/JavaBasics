package com.training.java.basics.chapter09;

public class IFTest3 {

	public static void main(String[] args) {
		InStack myInStack; // create an interface reference variable
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(8);

		myInStack = ds; // load dynamic stack
		for (int i = 0; i < 12; i++)
			myInStack.push(i);

		myInStack = fs; // load fixed stack
		for (int i = 0; i < 8; i++)
			myInStack.push(i);

		myInStack = ds;
		System.out.println("Values in dynamic stack:");
		for (int i = 0; i < 12; i++)
			System.out.println(myInStack.pop());

		myInStack = fs;
		System.out.println("Values in fixed stack:");
		for (int i = 0; i < 8; i++)
			System.out.println(myInStack.pop());

	}

}
