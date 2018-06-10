package com.bhavani.methods;

public class _6RecursiveMethod {
	static int a = 1;

	static void method1(int aVal) {
		System.out.println("Hello" + aVal + a);

		while (a <= 5) {
			a++;
			method1(aVal);
			System.out.println("1");
		}
	}

	public static void main(String[] args) {
		method1(100);
	}
}
