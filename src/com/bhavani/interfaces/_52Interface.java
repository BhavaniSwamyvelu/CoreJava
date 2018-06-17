package com.bhavani.interfaces;

public interface _52Interface {
	float fVal = 4.532f;

	void printMessage();

	default void get() {
		System.out.println("get2");
	}

	default void set() {
		System.out.println("set2\nset2");
	}

}
