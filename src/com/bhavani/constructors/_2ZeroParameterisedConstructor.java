package com.bhavani.constructors;

public class _2ZeroParameterisedConstructor {
	int iVal;
	int sVal;

	_2ZeroParameterisedConstructor() {
		iVal = 10;
		sVal = 20;
	}

	public static void main(String[] args) {
		_2ZeroParameterisedConstructor ref = new _2ZeroParameterisedConstructor();
		System.out.println(ref.iVal);
		System.out.println(ref.sVal);
	}
}
