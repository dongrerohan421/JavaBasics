package com.training.java.basics;

public class ConstructorExample {

	public static void main(String[] args) {

		ConstructorExample ce = new ConstructorExample();
		System.out.println(ce);

		ConstructorExample ce1 = new ConstructorExample(20);
		System.out.println(ce1);

		ConstructorExample ce2 = new ConstructorExample(50);
		System.out.println(ce2);
	}

	public int age = 0;

	public ConstructorExample() {
		// TODO Auto-generated constructor stub
		this.age = 0;
	}

	public ConstructorExample(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ConstructorExample [age=" + age + "]";
	}

}
