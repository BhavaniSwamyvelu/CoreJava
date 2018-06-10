package com.bhavani.blocks;

public class Block1 {
	static {
		System.out.println("static block 1 is executed");
	}
	static {
		System.out.println("static block 2 is executed");
	}

	public static void main(String[] args) {
		System.out.println("Main method is executed");

	}
}
