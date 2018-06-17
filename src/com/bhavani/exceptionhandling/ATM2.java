package com.bhavani.exceptionhandling;

import java.util.Scanner;

// Used Scanner here
public class ATM2 {

	int balance = 10000;

	void withDraw(int reqAmount) throws NoBalException {
		if (reqAmount > balance) {
			throw new NoBalException("Enter Proper Amount");
		} else {
			System.out.println("Amount can be Withdrawn");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
		int reqAmount = scan.nextInt();

		ATM1 atm = new ATM1();
		try {
			atm.withDraw(reqAmount);
		} catch (NoBalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}

}
