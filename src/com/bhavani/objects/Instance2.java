package com.bhavani.objects;

public class Instance2 {
	void display() {
		FloatObject ref = new FloatObject();
		System.out.println(ref.fVal);
		System.out.println(ref.getvalue());
	}

	public static void main(String[] args) {

		Instance2 ref = new Instance2();
		ref.display();
	}
}
