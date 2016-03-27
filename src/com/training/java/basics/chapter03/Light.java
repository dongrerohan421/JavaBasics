/*
 * Compute the distance light travels using long variables.
 * */

package com.training.java.basics.chapter03;

public class Light {

	public static void main(String[] args) {
		int lightSpeed;
		long days;
		long seconds;
		long distance;

		// approximate speed of light in mi/sec
		lightSpeed = 186000;

		days = 1000;// specify number of days here

		seconds = days * 24 * 60 * 60;// convert to seconds

		distance = lightSpeed * seconds;// compute distance

		System.out.print("In " + days);
		System.out.print(" days light travel about ");
		System.out.println(distance + " miles.");
	}

}
