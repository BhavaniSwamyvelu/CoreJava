package com.bhavani.blocks;

public class Block12a {
	float f = 10f;

	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Block12a ref = new Block12a();
		System.out.println(ref.f);

		Block12 ref1 = new Block12();
		System.out.println(ref1.i);
	}
}
