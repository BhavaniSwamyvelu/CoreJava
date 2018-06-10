package com.bhavani.methodoverloading;

public class _14MethodOverloading {
	void add(int iVal, float fVal) {
		float f = iVal + fVal;
		System.out.println(f);
	}

	void add(float fVal, int iVal) {
		float f = fVal + iVal;
		System.out.println(f);
	}

	public static void main(String[] args) {
		_14MethodOverloading obj = new _14MethodOverloading();
		obj.add(10, 10.1f);
		obj.add(10.25f, 10);
	}
}
