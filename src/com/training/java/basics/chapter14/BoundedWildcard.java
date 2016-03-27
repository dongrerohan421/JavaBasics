// Demonstrate a bounded wildcard.

package com.training.java.basics.chapter14;

public class BoundedWildcard {

	public static void main(String[] args) {
		TwoD td[] = { new TwoD(0, 0), new TwoD(7, 9), new TwoD(18, 4), new TwoD(-1, -23) };
		Coords<TwoD> tdlocs = new Coords<TwoD>(td);

		System.out.println("Contents of tdlocs.");
		showXY(tdlocs); // OK, is a TwoD
		// showXYZ(tdlocs); // Error, not a ThreeD
		// showAll(tdlocs); // Error, not a FourD

		// Now, create some FourD objects.
		FourD fd[] = { new FourD(1, 2, 3, 4), new FourD(6, 8, 14, 8), new FourD(22, 9, 4, 9),
				new FourD(3, -2, -23, 17) };

		Coords<FourD> fdlocs = new Coords<FourD>(fd);

		System.out.println("Contents of fdlocs.");
		// These are all OK.
		showXY(fdlocs);
		showXYZ(fdlocs);
		showAll(fdlocs);

	}

	static void showAll(Coords<? extends FourD> c) {
		System.out.println("X Y Z Tcoordinates.");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
		}
		System.out.println();
	}

	static void showXY(Coords<?> c) {
		System.out.println("X Y coordinates.");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		}
		System.out.println();
	}

	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X Y Z coordinates.");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		}
		System.out.println();
	}
}
