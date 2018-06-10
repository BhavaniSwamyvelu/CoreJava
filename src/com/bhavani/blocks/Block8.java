package com.bhavani.blocks;

public class Block8 {
	static int aVal = 100;

	{
		aVal = 200;
	}

	public static void main(String[] args) {
		System.out.println(aVal);
	}
}
