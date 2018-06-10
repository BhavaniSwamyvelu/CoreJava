package com.bhavani.thiskeyword;

public class _3ThisKeyword {
	int i = 10;
	float f = 3.14f;

	public _3ThisKeyword(int i, float f) {
		this.i = i;
		this.f = f;
	}

	public static void main(String[] args) {

		_3ThisKeyword ref = new _3ThisKeyword(20, 3.0012876290028f);
		System.out.println(ref.i + "\n" + ref.f);

	}

}
