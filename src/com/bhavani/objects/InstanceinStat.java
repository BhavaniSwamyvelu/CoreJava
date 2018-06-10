package com.bhavani.objects;
//program 10
public class InstanceinStat {
	int iVal = 10;

	int display() {
		return iVal + 1;
	}

	static void display1() {
		InstanceinStat ref = new InstanceinStat();
		System.out.println(ref.iVal);
		System.out.println(ref.display());
	}

	public static void main(String[] args) {
		display1();
	}
}
