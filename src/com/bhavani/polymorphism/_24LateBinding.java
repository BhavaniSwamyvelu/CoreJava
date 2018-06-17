package com.bhavani.polymorphism;

public class _24LateBinding {
	public static void main(String[] args) {
		_21LateBinding ref1 = new _21LateBinding();
		ref1.getMessage();

		_22LateBinding ref2 = new _22LateBinding();
		ref2.getMessage();

		_23LateBinding ref3 = new _23LateBinding();
		ref3.getMessage();

		_21LateBinding obj = new _22LateBinding();
		obj.getMessage();

		obj = new _23LateBinding();
		obj.getMessage();

		_22LateBinding obj1 = new _23LateBinding();
		obj1.getMessage();
	}

}
