// Another implementation of Callback.

package com.training.java.basics.chapter09;

public class AnotherClient implements Callback {

	@Override
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is " + (p * p));
	}

}
