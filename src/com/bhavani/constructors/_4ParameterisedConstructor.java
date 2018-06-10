package com.bhavani.constructors;

public class _4ParameterisedConstructor {
	int iVal;
	float fVal;

	public _4ParameterisedConstructor(int i, float f) {
		i = i;
		fVal = f;
	}

	public static void main(String[] args) {

		_4ParameterisedConstructor ref = new _4ParameterisedConstructor(10, 20.78f);
		System.out.println(ref.iVal + "\n" + ref.fVal);

		_4ParameterisedConstructor ref1 = new _4ParameterisedConstructor(30, 3.14f);
		System.out.println(ref1.iVal + "\n" + ref1.fVal);
	}

}
