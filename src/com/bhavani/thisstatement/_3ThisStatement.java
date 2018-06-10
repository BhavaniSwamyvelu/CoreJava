package com.bhavani.thisstatement;

public class _3ThisStatement {

	int iValue;
	float fValue;
	boolean bValue;

	public _3ThisStatement(float fValue) {
		System.out.println(this);
		this.fValue = fValue;

	}

	public _3ThisStatement() {
		this(3.44f);
		System.out.println(this);
		iValue = 200;
		bValue = true;
	}

	public static void main(String[] args) {
		_3ThisStatement ref = new _3ThisStatement();
		System.out.println(ref.iValue);
		System.out.println(ref.bValue);
		System.out.println(ref.fValue);

	}
}
