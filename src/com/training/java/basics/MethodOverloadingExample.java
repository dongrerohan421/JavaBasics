package com.training.java.basics;

public class MethodOverloadingExample {

	public static int add(int value1, int value2) {
		int result = 0;
		result = value1 + value2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = MethodOverloadingExample.add(10, 20);
		int r2 = add(11, 12);
		MethodOverloadingExample r3 = new MethodOverloadingExample();
		String r4 = r3.add("A", "B");

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r4);

	}

	public String add(String value1, String value2) {
		String result = value1 + value2;
		return result;
	}

}
