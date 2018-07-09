package com.bhavani.java.lang;

public class _1Example extends Object {
	public static void main(String[] args) {
		_1Example ref = new _1Example();
		System.out.println(ref);
		System.out.println(ref.toString());
		System.out.println(ref.hashCode());

		_1Example ref1 = new _1Example();
		System.out.println(ref1);
		System.out.println(ref1.toString());
		System.out.println(ref1.hashCode());

		System.out.println(ref.equals(ref));
		System.out.println(ref.equals(ref1));
	}

}
