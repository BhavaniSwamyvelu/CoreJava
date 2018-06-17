package com.bhavani.exceptionhandling;

public class ATM {
	int balance = 10000;

	void withDraw(int reqAmount) {

		if (reqAmount > balance) {
			try {
				throw new NoBalException("No Sufficient Balance");
			} catch (NoBalException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Amount Can be Withdrawn");
		}

	}

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.withDraw(15000);
	}

}