package com.bhavani.thisstatement;

public class _4ThisStatement {
	int iVal;
	boolean bVal;
	float fVal;

	public _4ThisStatement(float fVal) {
		System.out.println(this);
		this.fVal = fVal;
	}

	public _4ThisStatement() {
		this(3.142f);
		System.out.println(this);
		this.iVal = 200;
		this.bVal = true;
		this.fVal = 90.8f;
	}

	public static void main(String[] args) {
		_4ThisStatement ref = new _4ThisStatement();
		System.out.println(ref.iVal);
		System.out.println(ref.bVal);
		System.out.println(ref.fVal);

		_4ThisStatement ref1 = new _4ThisStatement();
		System.out.println(ref1.iVal);
		System.out.println(ref1.bVal);
		System.out.println(ref1.fVal);
	}
}
