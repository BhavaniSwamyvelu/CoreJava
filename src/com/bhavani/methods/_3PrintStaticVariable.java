package com.bhavani.methods;

public class _3PrintStaticVariable {
	static int iValue = 10;
	static boolean bValue;

	static void Sample1(int iValue, boolean bValue) {
		iValue = iValue;
		bValue = bValue;

	}

	public static void main(String[] args) {
		Sample1(100, true);
		System.out.println(iValue);
		System.out.println(bValue);
	}
}