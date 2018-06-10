package com.bhavani.blocks;

public class Block14b {
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		System.out.println(Block14a.i);
		Block14a ref = new Block14a();
		System.out.println(ref.s);
	}
}
