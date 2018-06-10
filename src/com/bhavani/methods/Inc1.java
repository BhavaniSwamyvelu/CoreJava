package com.bhavani.methods;

public class Inc1 {
	public static void main(String[] args) {
		int a = 1;
		int c;
		c = a++ + ++a + a++;
		System.out.println(c);
		System.out.println(a);
	}

}
