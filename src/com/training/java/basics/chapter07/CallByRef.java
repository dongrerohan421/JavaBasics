package com.training.java.basics.chapter07;

public class CallByRef {

	public static void main(String[] args) {
		Test ob = new Test(15, 20);

		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

		ob.meth(ob);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
	}

}
