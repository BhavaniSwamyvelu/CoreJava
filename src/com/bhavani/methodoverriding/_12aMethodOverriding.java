package com.bhavani.methodoverriding;

public class _12aMethodOverriding extends _12MethodOverriding {
	
	void printValue(int iVal) {
		System.out.println("Sub Class");
		super.printValue(200);
	}

}
