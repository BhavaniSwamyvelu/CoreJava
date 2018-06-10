package com.bhavani.oopsconcept;

public class _2ShallowCopy {

	int iVal;
	boolean bVal;

	public static void main(String[] args) {
		_2ShallowCopy ref = new _2ShallowCopy();
		ref.iVal = 100;
		ref.bVal = true;

		System.out.println(ref);
		System.out.println(ref.iVal);
		System.out.println(ref.bVal);

		_2ShallowCopy ref1 = ref;
		System.out.println(ref1);
		System.out.println(ref1.iVal);
		System.out.println(ref1.bVal);

		ref1.iVal = 200;
		ref1.bVal = false;

		System.out.println(ref.iVal);
		System.out.println(ref.bVal);
	}
}
