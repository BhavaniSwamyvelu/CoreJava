package com.bhavani.blocks;

public class Block15 {
	static {
		Block15a ref = new Block15a();
	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		Block15 ref1 = new Block15();
		System.out.println(Block15a.a);

		Block15a ref2 = new Block15a();
		System.out.println(ref2.b);

		Block15 ref3 = new Block15();
	}
}
