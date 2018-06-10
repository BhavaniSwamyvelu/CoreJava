package com.bhavani.blocks;

public class Block13 {
	{
		System.out.println("instance block is executed");
	}

	static {
		System.out.println("static block is executed");
	}

	public static void main(String[] args) {
		Block13 ref = new Block13();
		ref = new Block13();

	}
}
