package com.bhavani.interfaces;

public class _53Interface implements _51Interface, _52Interface {
	public void printMessage()

	{
		System.out.println("Implementation of Interface A method");
	}

	public void get() {
		_52Interface.super.get();
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		_51Interface.super.set();
	}
	


}
