package com.bhavani.objectcasting;

public class _43Example {
	public static void main(String[] args) {
		_41Example ref=new _42Example();
		System.out.println(ref);
		ref.printMessage();
		
		_42Example ref1=(_42Example) ref;
		ref1.printMessage();
		System.out.println(ref1); 
	}
	 

}
