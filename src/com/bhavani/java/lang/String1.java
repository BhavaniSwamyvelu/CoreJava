package com.bhavani.java.lang;

public class String1 {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		String str2 = "Hello,World";

		// Returns Content
		System.out.println(str.toString());
		System.out.println(str1.toString());
		System.out.println(str2.toString());

		// Same hashcode if content is same
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		// Compared based on content
		System.out.println(str.equals(str));
		System.out.println(str1.equals(str));
		System.out.println(str2.equals(str1));

		// To find Memory address
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		// Based on hashcode
		System.out.println(str == str1);
		System.out.println(str1 == str2);

	}

}
