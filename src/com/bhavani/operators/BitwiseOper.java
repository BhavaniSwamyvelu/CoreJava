package com.bhavani.operators;

public class BitwiseOper {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b | a < c);
		System.out.println(a < b & a < c);
		System.out.println(10 >> 2);
		System.out.println(10 << 2);
	}

}
