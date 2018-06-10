package com.bhavani.methodoverloading;

public class _12MethodOverloading {
	void getinfo(int pnr) {
		System.out.println("Train Details");
	}

	void getinfo(String src, String dest) {
		System.out.println("Flight Details");
	}

	void getinfo(int pnr, String src, String dest) {
		System.out.println("Bus Details");
	}
}
