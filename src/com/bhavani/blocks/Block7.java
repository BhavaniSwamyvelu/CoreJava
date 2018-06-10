package com.bhavani.blocks;

public class Block7 {
	int iVal = 100;

	static {
		int aVal = 10;
		System.out.println(aVal);
	}
	static {
		Block7 ref = new Block7();
		System.out.println(ref.iVal);
	}

	public static void main(String[] args) {
		Block7 ref = new Block7();
		System.out.println(ref.iVal);
	}
}
