package com.bhavani.exceptionhandling;

public class _14ExceptionHandling {
	void printValue(int iValue) {
		System.out.println(iValue);
	}

	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		_13ExceptionHandling ref = null;
		try {
			// c = a / b;
			ref.printValue(10);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.err.println("Null Value");
			e.printStackTrace();
		}
		System.out.println(c);
		System.out.println("---------Main ends-------");
	}

}
