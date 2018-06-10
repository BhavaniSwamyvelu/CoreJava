package com.bhavani.objectcasting;

public class _33SpecialCase {
	public static void main(String[] args) {
		_31SpecialCase ref = (_31SpecialCase) new _32SpecialCase();
		System.out.println(ref);
		ref.getMessage();

		_32SpecialCase ref1 = (_32SpecialCase) ref;
		System.out.println(ref1);
		ref1.getMessage();

	}

}
