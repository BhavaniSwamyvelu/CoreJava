package com.bhavani.polymorphism;

public class _11EarlyBinding {
	int getMessage(int a) {
		System.out.println("Get Message 1");
		return a;
	}

	int getMessage(int a, int b) {
		System.out.println("Get Message 2");
		return a + b;
	}
}
