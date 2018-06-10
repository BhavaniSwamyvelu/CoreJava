package com.bhavani.constructors;

public class _63ParameterizedConstructor {

	public static void main(String[] args) {
		_61ParameterizedConstructor ref = new _61ParameterizedConstructor();
		System.out.println(ref.iValue);

		System.out.println(ref.ref1);
		System.out.println(ref.ref1.iValue);
		System.out.println(ref.ref1.bValue);

		// accessing a instance variable using the object of type static
		System.out.println(_61ParameterizedConstructor.ref2);
		System.out.println(_61ParameterizedConstructor.ref2.iValue);
		System.out.println(_61ParameterizedConstructor.ref2.bValue);
	}

}
