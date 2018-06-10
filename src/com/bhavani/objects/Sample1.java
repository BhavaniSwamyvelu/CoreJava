package com.bhavani.objects;
// program 8
public class Sample1 {
	static int iVal = 100;

	int getvalue() {
		iVal = iVal + 1;
		return iVal;
	}

	int starvar() {
		return iVal;

	}

	public static void main(String[] args) {
		Sample1 sample = new Sample1();
		iVal = iVal + 1;
		System.out.println(iVal);
		System.out.println(sample.getvalue());

		Sample1 sample1 = new Sample1();
		System.out.println(sample1.getvalue());
		System.out.println(sample.starvar());
		System.out.println(sample1.starvar());
	}
}
