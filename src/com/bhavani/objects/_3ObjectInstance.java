package com.bhavani.objects;
//program 6
public class _3ObjectInstance {
	int i = 10;

	public static void main(String[] args) {

		_3ObjectInstance ref = new _3ObjectInstance();
		System.out.println(ref.i);
		ref.i = 20;
		System.out.println(ref.i);

		_3ObjectInstance ref1 = new _3ObjectInstance();
		System.out.println(ref1.i);
	}
}
