package com.bhavani.interfaces;

public interface _51Interface {
	boolean bVal = false;

	void printMessage();

	default void get() {
		System.out.println("get1");
	}
	
	default void set() {
		System.out.println("set1\nset1");
	}
}
