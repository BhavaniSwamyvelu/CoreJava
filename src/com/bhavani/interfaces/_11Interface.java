package com.bhavani.interfaces;

public abstract interface _11Interface {
	public static final boolean bVal = false;

	public abstract void printMessage();

	// After JDK 1.8 we can also have static methods inside interface
	static void getMessage() {
		System.out.println("Static method in interface A");
	}
	
	default void a(){
		System.out.println("Hi");
	}

}
