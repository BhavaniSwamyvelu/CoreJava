package com.bhavani.objectcasting;

public class _55Example {
	public static void main(String[] args) {
		_51Example ref = new _53Example();
		ref.setMessage();

		_53Example ref1 = (_53Example) ref;
		ref1.getMessage();
		ref1.printMessage();
		ref1.setMessage();
	}

}
