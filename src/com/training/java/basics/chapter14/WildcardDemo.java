package com.training.java.basics.chapter14;

public class WildcardDemo {

	public static void main(String[] args) {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);

		Double dnums[] = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("iob average is " + w);

		Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("iob average is " + x);

		// See which arrays have same average.
		System.out.print("Averages of iob and dob ");
		if (iob.sameAvg(dob))
			System.out.println("are the same.");
		else
			System.out.println("differ");

		System.out.print("Averages of iob and dob ");
		if (iob.sameAvg(fob))
			System.out.println("are the same.");
		else
			System.out.println("differ");
	}

}
