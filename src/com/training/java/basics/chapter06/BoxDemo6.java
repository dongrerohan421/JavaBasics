package com.training.java.basics.chapter06;

public class BoxDemo6 {

	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		double vol;

		// initialize each box
		// myBox1.setDim(10, 20, 15);
		// myBox2.setDim(3, 6, 9);

		// get volume of first block
		vol = myBox1.volume2();
		System.out.println("Volume is " + vol);

		// get volume of second block
		vol = myBox2.volume2();
		System.out.println("Volume is " + vol);
	}

}
