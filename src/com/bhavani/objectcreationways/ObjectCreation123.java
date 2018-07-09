package com.bhavani.objectcreationways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation123 {
	int i;

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		// 1st Way
		ObjectCreation123 obj1 = new ObjectCreation123();
		System.out.println(obj1);

		// 2nd Way
		// Loading a class in two ways
		// 1: Class.forName("com.bhavani.objectcreationways.ObjectCreation123")
		// 2: ObjectCreation123.class

		ObjectCreation123 obj2 = (ObjectCreation123) Class.forName("com.bhavani.objectcreationways.ObjectCreation123")
				.newInstance();
		System.out.println(obj2);

		ObjectCreation123 obj3 = ObjectCreation123.class.newInstance();
		System.out.println(obj3);

		// 3rd Way
		ObjectCreation123 obj4 = (ObjectCreation123) Class.forName("com.bhavani.objectcreationways.ObjectCreation123")
				.getConstructor().newInstance();
		System.out.println(obj4);

		ObjectCreation123 obj5 = ObjectCreation123.class.getConstructor().newInstance();
		System.out.println(obj5);

		Constructor<ObjectCreation123> reference = ObjectCreation123.class.getConstructor();
		System.out.println(reference);
		ObjectCreation123 obj6 = reference.newInstance();
		System.out.println(obj6);

	}
}
