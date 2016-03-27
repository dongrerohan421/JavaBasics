package com.training.java.basics;

public abstract class Vehicle {
	private String make;
	private String model;
	private String vin;
	private int year;

	public Vehicle(String make, String model, String vin, int year) {
		super(); // Object class is super class for this class.
		this.make = make;
		this.model = model;
		this.vin = vin;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getVin() {
		return vin;
	}

	public int getYear() {
		return year;
	}

	// public abstract abstractMethod();

}
