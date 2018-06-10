package com.bhavani.methodoverriding;

public class _13aMethodOverriding extends _13MethodOverriding {
	int iVal=1;
	double dVal=1;

	public _13aMethodOverriding(int iVal, double dVal) {
		super.iVal = iVal;
		super.dVal = dVal;// constructor
	}

	void printValues() {
		System.out.println(iVal);
		System.out.println(dVal);
		System.out.println(super.iVal);
		System.out.println(super.dVal);
	}
}
