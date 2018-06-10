package com.bhavani.inheritance;

public class _14HierarchicalInheritance {
	public static void main(String[] args) {
		_12HierarchicalInheritance ref = new _12HierarchicalInheritance();
		System.out.println(ref.iVal);
		System.out.println(ref.fVal);
		ref.display();
		ref.display1();

		_13HierarchicalInheritance ref1 = new _13HierarchicalInheritance();
		System.out.println(ref1.aVal);
		System.out.println(ref1.iVal);
		ref1.display();
		ref1.display2();
	}

}
