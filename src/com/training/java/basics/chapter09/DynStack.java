package com.training.java.basics.chapter09;

//Implement a "growable" stack.
public class DynStack implements InStack {
	private int stck[];
	private int tos;

	public DynStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[tos--];
	}

	@Override
	public void push(int item) {
		// if stack is full, allocate a larger stack
		if (tos == stck.length - 1) {
			int temp[] = new int[stck.length * 2]; // double size
			for (int i = 0; i < stck.length; i++) {
				temp[i] = stck[i];
			}
			stck = temp;
			stck[++tos] = item;
		} else
			stck[++tos] = item;
	}

}
