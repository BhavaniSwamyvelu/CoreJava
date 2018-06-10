package com.bhavani.constructor_overloading;

public class _1ConstructorOverloading {

	public _1ConstructorOverloading(int i) {
		System.out.println(i);
	}

	public _1ConstructorOverloading(char a, float f) {
		System.out.println(a + "\n" + f);
	}

	public _1ConstructorOverloading(long l, int s, float b) {
		System.out.println(l + "\n" + s + "\n" + b);
	}

	public static void main(String[] args) {
		_1ConstructorOverloading ref = new _1ConstructorOverloading(100);
		_1ConstructorOverloading ref1 = new _1ConstructorOverloading('b', 2.980f);
		_1ConstructorOverloading ref2 = new _1ConstructorOverloading(20000l, 1, 1);
	}

}
