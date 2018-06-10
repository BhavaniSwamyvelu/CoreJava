package com.bhavani.thisstatement;

public class _5ThisStatement {
	int iVal;
	boolean bVal;
	float fVal;

	public _5ThisStatement(int val) {
		iVal = val;
	}

	public _5ThisStatement(boolean val) {
		this(100);
		bVal = val;

	}

	public _5ThisStatement(float fVal) {
		this(false);
		fVal = fVal;
	}

	public static void main(String[] args) {
		_5ThisStatement ref = new _5ThisStatement(3.14f);
		System.out.println(ref.fVal);
		System.out.println(ref.bVal);
		System.out.println(ref.iVal);
	}
}
