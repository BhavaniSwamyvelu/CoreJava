package com.bhavani.blocks;

public class Block16a {
	static {
		System.out.println(Block16b.f);
		System.out.println("Hello");
		Block16b ref = new Block16b();
		System.out.println("Hello1");
	}

	{
		System.out.println("ccccccccccc");
	}
}
