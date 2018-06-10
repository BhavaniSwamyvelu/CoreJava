package com.bhavani.objectcasting;

public class _13UpCasting {
	public static void main(String[] args) {
		_11UpCasting ref = (_11UpCasting) new _12UpCasting();
		System.out.println(ref);
		ref.getMessage();

		// Incase of Upcasting the upcasted object can access only a copy of
		// superclass members
		// ref.testMessage();
		// ref.test();
	}

}
