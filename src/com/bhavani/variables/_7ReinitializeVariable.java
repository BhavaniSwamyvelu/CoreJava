package com.bhavani.variables;

public class _7ReinitializeVariable {
	static int aValue = 10;

	void change() {
		aValue = 15;
	}

	public static void main(String[] args) {
		int aVal = 25;
		aVal = 28;
		System.out.println(aVal);
		System.out.println(aValue);
	}

}
