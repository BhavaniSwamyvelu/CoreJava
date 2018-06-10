package com.bhavani.operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = ++a - --a + a++ + b++ - b-- + a-- - ++b + --b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}

}
