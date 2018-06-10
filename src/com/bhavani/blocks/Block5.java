package com.bhavani.blocks;

public class Block5 {
	static int i = 100;
	static {
		int i = 10;
	}
	static {
		int i = 20;
	}
	static {
		int i = 30;
	}

	public static void main(String[] args) {
		System.out.println(i);
	}
}
