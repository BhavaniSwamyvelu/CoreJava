package com.bhavani.factorydesignpatterns;

public class CalcImpl implements Icalculation {

	@Override
	public void addValues(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	@Override
	public void subValues(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

}
