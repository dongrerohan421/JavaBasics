package com.training.java.basics.chapter09;

public class TestIface {

	public static void main(String[] args) {
		Callback c = new Client();
		c.callback(42);
	}

}
