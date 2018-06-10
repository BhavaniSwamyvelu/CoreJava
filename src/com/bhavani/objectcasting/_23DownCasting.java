package com.bhavani.objectcasting;

public class _23DownCasting {
	public static void main(String[] args) {
		_21DownCasting ref = new _22DownCasting();
		System.out.println(ref);
		ref.getMessage();

		_22DownCasting ref1 = (_22DownCasting) ref;
		System.out.println(ref1);
		ref1.getMessage();
		ref1.testMessage();
		ref1.test();
	}

}
