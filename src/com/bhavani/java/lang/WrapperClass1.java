package com.bhavani.java.lang;

public class WrapperClass1 {
	public static void main(String[] args) {

		System.out.println("Primitive datatype to an object ");
		byte b = 10;
		Byte bVal = new Byte(b);
		System.out.println(bVal);

		short s = 20;
		Short sVal = new Short(s);
		System.out.println(sVal);

		int i = 100;
		Integer iVal = new Integer(i);
		System.out.println(iVal);

		long l = 1000000000000l;
		Long lVal = new Long(l);
		System.out.println(lVal);

		float f = 3.14f;
		Float fVal = new Float(f);
		System.out.println(fVal);

		double d = 3.9999888;
		Double dVal = new Double(d);
		System.out.println(dVal);

		char c = 'a';
		Character cVal = new Character(c);
		System.out.println(cVal);

		boolean bool = false;
		Boolean boolVal = new Boolean(bool);
		System.out.println(boolVal);

		System.out.println("Object to Primitive Datatype");
		System.out.println(bVal.byteValue());
		System.out.println(sVal.shortValue());
		System.out.println(iVal.intValue());
		System.out.println(lVal.longValue());
		System.out.println(fVal.floatValue());
		System.out.println(dVal.doubleValue());
		System.out.println(cVal.charValue());
		System.out.println(boolVal.booleanValue());

	}

}
