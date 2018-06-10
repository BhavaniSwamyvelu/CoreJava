package com.bhavani.blocks;

public class Block14a {
	static int i = 10;
	int s = 5;
	static {
		System.out.println(i);
		i = 20;
	}
	
	{
		s = 10;
	}
}
