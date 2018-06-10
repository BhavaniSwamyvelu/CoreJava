package com.bhavani.blocks;

public class Block15a {
	static int a = 20;
	float b = 10.0f;

	static {
		System.out.println(a);
		a = 10;
	}
	{
		b = 3.14f;
	}
}
