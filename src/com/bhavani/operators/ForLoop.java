package com.bhavani.operators;

public class ForLoop {

	static void m() {
		int i = 0;
		for (; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Debugging");
		m();

		int[] a = { 10, 20, 30, 40, 50 };
		for (int i1 : a) {
			System.out.print(i1 + " ");
		}

	}

}
