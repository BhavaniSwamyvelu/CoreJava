package com.bhavani.oopsconcept;

public class _3DeepCopy {

	int iVal = 10;
	boolean bVal = false;

	public static void main(String[] args) {
		_3DeepCopy ref = new _3DeepCopy();
		System.out.println(ref);
		ref.iVal = 100;
		System.out.println(ref.iVal);
		
		_3DeepCopy ref1 = new _3DeepCopy();
		ref1.iVal = ref.iVal;
		System.out.println(ref1);
		System.out.println(ref1.iVal);
		
		ref1.iVal = 200;
		System.out.println(ref1.iVal);
		System.out.println(ref.iVal);

	}

}
