package com.bhavani.blocks;

public class Block9 {
	int aVal = 100;
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		Block9 ref = new Block9();
		System.out.println(ref.aVal);
		ref = new Block9();
	}
}
