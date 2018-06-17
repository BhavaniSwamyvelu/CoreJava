package com.bhavani.copyconstructors;

public class _1Copyconstructors {
	int iVal;
	double dVal;

	public _1Copyconstructors(int iVal, double dVal) {
		this.iVal = iVal;
		this.dVal = dVal;
	}

	public _1Copyconstructors(_1Copyconstructors ref1) {
		iVal = ref1.iVal;
		dVal = ref1.dVal;
	}

	public static void main(String[] args) {
		_1Copyconstructors ref = new _1Copyconstructors(100, 20.000000000000);
		System.out.println(ref);
		System.out.println(ref.iVal);
		System.out.println(ref.dVal);

		_1Copyconstructors ref1 = new _1Copyconstructors(ref);
		System.out.println(ref1);
		System.out.println(ref1.iVal);
		System.out.println(ref1.dVal);
	}
}
