package com.training.java.basics;

public abstract class Student {
	String name;
	int studenId;

	void getName() {
		System.out.println(name);

	}

	abstract void getStudentId();

}
