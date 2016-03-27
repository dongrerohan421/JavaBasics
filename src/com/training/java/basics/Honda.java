package com.training.java.basics;

public class Honda extends Vehicle {

	private String hondaType;

	public Honda(String make, String model, String vin, int year) {
		this(make, model, vin, year, null);
		// TODO Auto-generated constructor stub
	}

	public Honda(String make, String model, String vin, int year, String hondaType) {
		super(make, model, vin, year);
		this.hondaType = hondaType;
	}

	public String getHondaType() {
		return hondaType;
	}

}
