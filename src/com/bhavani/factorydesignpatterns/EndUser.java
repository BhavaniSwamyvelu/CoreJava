package com.bhavani.factorydesignpatterns;

public class EndUser {
	public static void main(String[] args) {

		Icalculation ref = CalcFactory.getObject();
		ref.addValues(10, 20);
		ref.subValues(20, 10);
		
	}
}
