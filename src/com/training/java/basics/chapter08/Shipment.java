package com.training.java.basics.chapter08;

//Add shipping costs.
public class Shipment extends BoxWeight {
	double cost;

	// default constructor
	public Shipment() {
		super();
		cost = -1;
	}

	public Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}

	// constructor when all parameters are specified
	public Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m);
		cost = c;
	}

	public Shipment(Shipment ob) {
		// pass object to constructor
		super(ob);
		cost = ob.cost;
	}
}
