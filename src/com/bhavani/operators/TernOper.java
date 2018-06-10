package com.bhavani.operators;

public class TernOper {
	public static void main(String[] args) {
		int aVal = 10;
		int bVal = 5;
		int cVal = 15;
		System.out.println(aVal < bVal && aVal < cVal);
		System.out.println(aVal > bVal || aVal < cVal);
		int min = aVal >= bVal && aVal < cVal ? aVal : bVal;
		System.out.println(min);
	}
}
