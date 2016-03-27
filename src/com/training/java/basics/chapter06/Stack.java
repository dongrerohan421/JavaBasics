// This class defines an integer stack that can hold 10 values.

package com.training.java.basics.chapter06;

public class Stack {

	private int stck[] = new int[10];
	private int tos;

	// Initialize to-of-stack
	public Stack() {
		tos = -1;
	}

	// Pop an item from the stack
	int pop() {
		if (tos < 0) {
			System.out.println("tos: " + tos);
			System.out.println("Stack underflow");
			return 0;
		} else {
			System.out.print("tos:  " + tos);
			System.out.println(" stck[tos]: " + stck[tos]);
			return stck[tos--];

		}

	}

	// Push an item onto the stack
	void push(int item) {
		if (tos == 9)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
}
