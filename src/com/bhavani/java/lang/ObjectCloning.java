package com.bhavani.java.lang;

public class ObjectCloning implements Cloneable {

	//private static Object ref1;
	// private static final Object ObjectCloning = null;
	char a = 'a';

	void get() {
		a = 'd';
	}

	// we can override this clone() as per documentation
	// public Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }

	public static void main(String[] args) {
		ObjectCloning ref = new ObjectCloning();
		ref.get();
		System.out.println(ref);
		System.out.println(ref.a);

		ref.a = 'b';
		System.out.println(ref.a);

		try {
			// First way
			Object ref1 = ref.clone();
			System.out.println(ref1);

			ObjectCloning ref2 = (ObjectCloning) ref1;
			System.out.println(ref2);
			System.out.println(ref2.a);
			// second way
			ObjectCloning ref3 = (ObjectCloning) ref.clone();
			System.out.println(ref3);
			System.out.println(ref3.a);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
