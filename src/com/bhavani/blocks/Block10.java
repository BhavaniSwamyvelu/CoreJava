package com.bhavani.blocks;

public class Block10 {
	int iVal = 10;

	{
		System.out.println("Hello");
		int iVal = 5;
		System.out.println(iVal);
	}

	public static void main(String[] args) {
		Block10 ref = new Block10();
		System.out.println(ref.iVal);

		ref = new Block10();
		System.out.println(ref.iVal);
	}
}
