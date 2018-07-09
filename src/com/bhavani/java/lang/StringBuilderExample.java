package com.bhavani.java.lang;

public class StringBuilderExample {
	public static void main(String[] args) {

		java.lang.StringBuilder str = new java.lang.StringBuilder("Hello");
		StringBuilder str1 = new StringBuilder("Hello");
		StringBuilder str2 = new StringBuilder("HelloWorld");

		// Overrideen..  Retuern Content
		System.out.println(str.toString());
		System.out.println(str1.toString());
		System.out.println(str2.toString());

		// Not overriden -- will use Object class Impl
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		// Based on Memory Address
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));

		// Based on Hashcode
		System.out.println(str == str1);
		System.out.println(str == str2);

	}

}
