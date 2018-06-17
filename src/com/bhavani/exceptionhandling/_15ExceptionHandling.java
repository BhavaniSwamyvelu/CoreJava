package com.bhavani.exceptionhandling;

public class _15ExceptionHandling {
	void printValue(int iValue) {
		System.out.println(iValue);
	}

	public static void main(String[] args) {
		System.out.println("------Main Starts-------");
		int a = 10, b = 0, c = 0;
		_13ExceptionHandling ref = null;
		try {
			// c = a / b;
			ref.printValue(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Always the parent exception catch block must be the last catch
		// block.. Present in Notes(Note)
		// catch (ArithmeticException e) {
		// e.printStackTrace();
		// } catch (NullPointerException e) {
		// e.printStackTrace();
		// }
		System.out.println(c);
		System.out.println("---------Main ends-------");
	}

}
