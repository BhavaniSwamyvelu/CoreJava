package com.bhavani.methodoverloading;

public class _11MethodOverloading {
	int iVal = 10;

	void printMessage() {
		System.out.println("Hello");
	}

	int printMessage(int iVal) {
		System.out.println(iVal);
		return iVal;
	}

	static final void printMessage(float fVal, int iVal) {
		System.out.println(fVal);
		System.out.println(iVal);
	}

	public static void main(String[] args) {

		_11MethodOverloading ref = new _11MethodOverloading();
		ref.printMessage();
		ref.printMessage(20);
		printMessage(3.14f, 40);
	}
}
