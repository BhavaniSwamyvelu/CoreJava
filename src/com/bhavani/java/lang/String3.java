package com.bhavani.java.lang;

public class String3 {
	public static void main(String[] args) {
		String str = "HelloWorld";

		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.contains("HelloIndia"));
		System.out.println(str.contains("HelloWorld"));
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("o"));
		System.out.println(str.substring(1, 5));
		System.out.println(str.startsWith("W", 5));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.concat("!Welcome"));

		System.out.println();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		System.out.println();
		for (int i = ch.length - 1; i > 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println();
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
