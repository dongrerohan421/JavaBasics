package com.training.java.basics.chapter07;

public class OverloadCons {

	public static void main(String[] args) {
		// create boxes using the various construction
		Box myBox1 = new Box(10, 20, 15);
		Box myBox2 = new Box();
		Box myCube = new Box(7);

		double vol;

		vol = myBox1.volume();
		System.out.println("Volume of mybox1 is " + vol);

		vol = myBox2.volume();
		System.out.println("Volume of mybox2 is " + vol);

		vol = myCube.volume();
		System.out.println("Volume of mycube is " + vol);

	}

}
