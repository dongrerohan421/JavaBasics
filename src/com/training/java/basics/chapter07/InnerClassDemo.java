package com.training.java.basics.chapter07;

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer objOuter = new Outer();
		objOuter.test();
	}

}

// Demonstrate an inner class.
class Outer {
	/*
	 * class Inner { void display() { System.out.println("display: outer_x = " +
	 * outer_x); } }
	 */

	int outer_x = 100;

	void test() {
		for (int i = 0; i < 10; i++) {
			class Inner {
				void display() {
					System.out.println("display: outer_x = " + outer_x);
				}
			}
			Inner objInner = new Inner();
			objInner.display();
		}
		/*
		 * Inner objInner = new Inner(); objInner.display();
		 */
	}
}
