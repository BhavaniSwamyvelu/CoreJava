package com.bhavani.inheritance;

public class _13MultilevelInheritance extends _12MultilevelInheritance {
	float fVal = 3.14f;

	public void getMessage() {
		super.getMessage();
		System.out.println("Method of class C");

	}
}
