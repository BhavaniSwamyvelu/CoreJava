package com.bhavani.objects;

//program 3,5
public class _2InstanceAccess {

	static int sVal = 50;

	static void display1() {
		System.out.println("STATIC METHOD");
	}

	int iVal = 10;

	void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println(sVal);
		System.out.println(_2InstanceAccess.sVal);
		display1();
		_2InstanceAccess.display1();

		_2InstanceAccess ref = new _2InstanceAccess();
		System.out.println(ref);
		System.out.println(ref.iVal);
		ref.display();
	}
}
