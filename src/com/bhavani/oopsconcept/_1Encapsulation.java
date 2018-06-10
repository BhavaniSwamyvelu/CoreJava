package com.bhavani.oopsconcept;

public class _1Encapsulation {
	int iVal;
	float fVal;

	public static void main(String[] args) {
		_1Encapsulation ref = new _1Encapsulation();
		ref.iVal = 100;
		ref.fVal = 3.90f;
		System.out.println(ref.iVal);
		System.out.println(ref.fVal);

		_1Encapsulation ref1 = new _1Encapsulation();
		ref1.iVal = 200;
		ref1.fVal = 4.98f;
		System.out.println(ref1.iVal);
		System.out.println(ref1.fVal);
	}
}
