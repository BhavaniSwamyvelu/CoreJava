package com.bhavani.blocks;

public class Block6 {
	static int i = 100;
	static {
		int i = 10;
		System.out.println(i);
	}
	static {
		int i = 20;
		System.out.println(i);
	}
	static {
		int i = 30;
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println(i);
	}

}
