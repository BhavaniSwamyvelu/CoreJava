package com.bhavani.exceptionhandling;

public class _13ExceptionHandling {
	void printValue(int iValue) {
		System.out.println(iValue);
	}

	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		_13ExceptionHandling ref = null;
		try {
			c = a / b;

		} catch (ArithmeticException e) {
			e.printStackTrace();
			try {
				ref.printValue(10);
			} catch (NullPointerException e1) {
				System.err.println("hjdfkvd");
				e1.printStackTrace();
			}
		}
		System.out.println(c);
		System.out.println("---------Main ends-------");
	}
}
