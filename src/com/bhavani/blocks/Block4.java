package com.bhavani.blocks;

public class Block4 {
	static int iVal = 100;
	static {
		iVal = 200;
	}
	static {
		iVal = 300;
	}
	static {
		iVal = 400;
	}

	public static void main(String[] args) {
		System.out.println(iVal);
	}
}
