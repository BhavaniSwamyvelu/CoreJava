package com.bhavani.thiskeyword;

public class _1ThisKeyword {

	public _1ThisKeyword() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		_1ThisKeyword ref = new _1ThisKeyword();
		System.out.println(ref);

		_1ThisKeyword ref1 = new _1ThisKeyword();
		System.out.println(ref1);

	}
}
