package com.bhavani.objects;

//program 1.3.4
public class _1PrintObjects {
	public static void main(String[] args) {
		_1PrintObjects ref = new _1PrintObjects();
		System.out.println(ref);

		Objects2 ref1 = new Objects2();// Accessing a object from a different
										// class
		System.out.println(ref1);

		ref = new _1PrintObjects();
		System.out.println(ref);// Reinitialization of an object
	}

}
