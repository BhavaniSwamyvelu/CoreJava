package com.bhavani.exceptionhandling;

public class ATM1 {
	int balance = 10000;

	void withDraw(int reqAmount) throws NoBalException {
		if (reqAmount > balance) {
			throw new NoBalException("Enter Proper Amount");
		} else {
			System.out.println("Amount can be Withdrawn");
		}
	}

	public static void main(String[] args) throws NoBalException {
		ATM1 atm = new ATM1();
		atm.withDraw(5000);
	}

}
