package com.bhavani.constructor_overloading;

public class _3ConstructorOverloading {

	public _3ConstructorOverloading(int i, char a) {
		System.out.println(i + "\n" + a);
	}

	public _3ConstructorOverloading(float f, long l) {
		System.out.println(f + "\n" + l);
	}

	public static void main(String[] args) {
		_3ConstructorOverloading ref = new _3ConstructorOverloading(100, 'a');
		_3ConstructorOverloading ref1 = new _3ConstructorOverloading(3.14f, 1030000l);
	}
}
