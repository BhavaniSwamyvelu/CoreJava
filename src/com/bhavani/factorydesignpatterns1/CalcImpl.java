package com.bhavani.factorydesignpatterns1;

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

	Icalculation get(Icalculation ref) {
		System.out.println(ref);
		return ref;
	}

}
