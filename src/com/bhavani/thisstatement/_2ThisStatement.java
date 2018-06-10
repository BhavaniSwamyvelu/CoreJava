package com.bhavani.thisstatement;

public class _2ThisStatement {
	{
		System.out.println("Instance block");
	}

	public _2ThisStatement() {
		this(20, 2.35f);
		System.out.println("ZERO PARAMETERIZED CONSTRUCTOR");
	}

	_2ThisStatement(int iValue) {
		this(10, 3.24f);
		System.out.println("one parameterized constructor");
	}

	_2ThisStatement(int iValue, float fValue) {
		System.out.println("two parameterized constructor");
	}

	public static void main(String[] args) {
		_2ThisStatement obj = new _2ThisStatement();

		_2ThisStatement obj1 = new _2ThisStatement(100);
	}
}
