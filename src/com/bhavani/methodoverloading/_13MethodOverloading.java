package com.bhavani.methodoverloading;

public class _13MethodOverloading {
	void add(int iVal, float fVal) {
		float f = iVal + fVal;
		System.out.println(f);
	}

	void add(float fVal, int iVal) {
		float f = fVal + iVal;
		System.out.println(f);
	}

	public static void main(String[] args) {
		_13MethodOverloading obj = new _13MethodOverloading();

		// If I uncomment the below line there is no matching method is present
		// here so implicit casting takes place and the below object suits for
		// both the methods so the compiler is in ambiguity to call any of the
		// methods

		// obj.add(10,10);
	}
}
