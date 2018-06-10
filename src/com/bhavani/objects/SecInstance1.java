package com.bhavani.objects;
//program 12
public class SecInstance1 {

	int iVal = 10;

	int display() {
		return iVal + 10;
	}

	void getvalue() {
		System.out.println(iVal);
		System.out.println(display());
	}

	public static void main(String[] args) {
		SecInstance1 ref = new SecInstance1();
		ref.getvalue();
	}
}
