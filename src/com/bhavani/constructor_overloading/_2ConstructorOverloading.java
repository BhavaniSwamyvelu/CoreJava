package com.bhavani.constructor_overloading;

public class _2ConstructorOverloading {

	public _2ConstructorOverloading(int i, float f) {
		System.out.println("i" + i + "\n" + "f" + f);

	}

	public _2ConstructorOverloading(float f, int i) {
		System.out.println(f + "\n" + i);
	}

	public static void main(String[] args) {

		_2ConstructorOverloading obj1 = new _2ConstructorOverloading(2003004, 9.0000005f);

		_2ConstructorOverloading obj = new _2ConstructorOverloading(3.009887756f, 10000);

	}
}
