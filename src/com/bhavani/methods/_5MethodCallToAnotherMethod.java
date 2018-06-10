package com.bhavani.methods;

public class _5MethodCallToAnotherMethod {
	static void method1() {
		System.out.println("Hello,Java");
	}

	static int method2(int aVal, int bVal) {
		int cVal;
		cVal = aVal + bVal;
		method1();
		return cVal;
	}

	public static void main(String[] args) {
		System.out.println(method2(100, 200));
	}

}
