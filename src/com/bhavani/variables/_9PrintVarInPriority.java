package com.bhavani.variables;

public class _9PrintVarInPriority {
	static int iVal = 20;
	int iVal1 = 15;

	public static void main(String[] args) {
		int iVal = 30;
		System.out.println(iVal);
		_9PrintVarInPriority ref=new _9PrintVarInPriority();
		System.out.println(ref.iVal1);
		System.out.println(_9PrintVarInPriority.iVal);
	}

}
