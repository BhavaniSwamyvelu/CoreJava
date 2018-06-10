package com.bhavani.objects;

//program 11
public class FirstStat {
	static void display1() {
		SecInstance ref = new SecInstance();
		System.out.println(ref.iVal);
		System.out.println(ref.display());

	}

	public static void main(String[] args) {
		display1();
	}
}
