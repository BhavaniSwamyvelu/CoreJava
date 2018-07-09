package com.bhavani.java.lang;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("This is Chennai");

		str.append(" City");
		System.out.println(str);

		str.insert(7, " a good");
		System.out.println(str);

		str.delete(9, 14);
		System.out.println(str);

		System.out.println(str.reverse());
	}
}
