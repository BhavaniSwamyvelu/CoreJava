package com.bhavani.exceptionhandling;

import java.util.Scanner;

public class _12ExceptionHandling {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Some Number");
		int i = scan.nextInt();
		int a = 10, b = 0, c = 0;
		System.out.println("---------Main Starts--------");
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			scan.close();
			System.out.println("Hi1");
			System.exit(0);
			System.out.println("Hi2");
		}
		System.out.println(c);
		System.out.println("---------Main Ends----------");
	}

}
