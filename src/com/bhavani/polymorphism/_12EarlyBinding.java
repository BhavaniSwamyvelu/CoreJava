package com.bhavani.polymorphism;

public class _12EarlyBinding {
	public static void main(String[] args) {
		_11EarlyBinding ref = new _11EarlyBinding();
		System.out.println(ref.getMessage(10));
		System.out.println(ref.getMessage(10, 20));

	}
}
