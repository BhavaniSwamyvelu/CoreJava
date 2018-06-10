package com.bhavani.thisstatement;

public class _1ThisStatement {

	public _1ThisStatement() {
		this(10);
		System.out.println("Zero Parameterized constructor");
	}

	_1ThisStatement(int a) {
		System.out.println("one parameterized constructor");
	}

	_1ThisStatement(int a, float f) {
		this();
		System.out.println("Two parameter constructor");
	}

	public static void main(String[] args) {

		_1ThisStatement ref = new _1ThisStatement(10, 3.14f);

	}
}
