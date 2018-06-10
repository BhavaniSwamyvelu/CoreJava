package com.bhavani.methods;

public class _1StaticMethod{
	static void first() {
		System.out.println("Hello");

	}

	static int add1(int aVal, int bVal) {
		System.out.println(aVal + "\n" + bVal);
		return aVal + bVal;
	}

	public static void main(String[] args) {
		first();
		add1(10, 20);
		_1StaticMethod.first();
		_1StaticMethod.add1(20, 30);
	}
}
