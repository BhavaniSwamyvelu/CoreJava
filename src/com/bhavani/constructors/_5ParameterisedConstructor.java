package com.bhavani.constructors;

public class _5ParameterisedConstructor {
	float fValue;
	boolean bValue;

	public _5ParameterisedConstructor(float f, boolean b) {
		fValue = f;
		bValue = b;

	}

	public _5ParameterisedConstructor() {
		float fVal = 10.0f;
		boolean bVal = false;
		fValue = fVal;
		bValue = bVal;

	}

	public static void main(String[] args) {

		_5ParameterisedConstructor ref = new _5ParameterisedConstructor(3.14f, true);
		System.out.println(ref.fValue + "\n" + ref.bValue);

		_5ParameterisedConstructor ref1 = new _5ParameterisedConstructor();
		System.out.println(ref1.fValue + "\n" + ref1.bValue);

	}
}
