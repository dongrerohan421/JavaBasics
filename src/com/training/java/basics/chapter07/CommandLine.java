/*
 *  A command-line argument is the information that directly follows
 *  the program’s name on the command line when it is executed.
 *
 *   To access the command-line arguments inside a Java program is quite
 *   easy - they are stored as strings in a String array passed to the args
 *   parameter of main( ).
 * */

// Display all command-line arguments.

package com.training.java.basics.chapter07;

public class CommandLine {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]" + args[i]);
		}
	}

}
