package com.training.java.basics.chapter09;

//B implements the nested interface.
public class B implements A.NestedIF {

	@Override
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}

}
