package com.bhavani.objectcasting;

public class _54Example {
	public static void main(String[] args) {
		_52Example ref = new _53Example();
		ref.getMessage();
		ref.printMessage();
		ref.setMessage();

		_52Example ref1 = (_52Example) ref;
		ref1.getMessage();
		ref1.printMessage();
		ref1.setMessage();

	}

}
