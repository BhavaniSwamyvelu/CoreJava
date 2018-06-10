package com.bhavani.objects;

//program13
public class Instance3 {

	void display(FloatObject ref1) {
		System.out.println(ref1.fVal);
		System.out.println(ref1.getvalue());
	}

	public static void main(String[] args) {

		Instance3 ref = new Instance3();
		FloatObject ref1 = new FloatObject();

		ref.display(ref1);

	}
}
