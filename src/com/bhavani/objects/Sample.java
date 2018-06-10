package com.bhavani.objects;
//program 7
public class Sample {
	static int iVal = 100;

	int getvalue() {
		iVal = iVal + 1;
		return iVal;
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		iVal = iVal + 1;
		System.out.println(iVal);
		System.out.println(sample.getvalue());
		Sample sample1 = new Sample();
		System.out.println(sample1.getvalue());

	}

}
