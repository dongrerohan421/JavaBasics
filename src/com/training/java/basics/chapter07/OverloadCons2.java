package com.training.java.basics.chapter07;

public class OverloadCons2 {

	public static void main(String[] args) {
		// create boxes using the various constructors
		Box myBox1 = new Box(10, 20, 15);
		Box myBox2 = new Box();
		Box myCube = new Box(7);

		Box myClone = new Box(myBox1); // create copy of mybox1

		double vol;

		// get volume of first box
		vol = myBox1.volume();
		System.out.println("Volume of mybox1 is " + vol);

		vol = myBox2.volume();
		System.out.println("Volume of mybox2 is " + vol);

		vol = myCube.volume();
		System.out.println("Volume of myCube is " + vol);

		vol = myClone.volume();
		System.out.println("Volume of myClone is " + vol);
	}

}
