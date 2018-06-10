package com.bhavani.factorydesignpatterns;

public class CalcFactory {

	static Icalculation getObject() {
		return new CalcImpl();
	}
	
}
