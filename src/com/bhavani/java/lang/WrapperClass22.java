package com.bhavani.java.lang;

public class WrapperClass22 {
	public static void main(String[] args) {
		String s1 = "100";
		Byte bVal = new Byte(s1);
		byte bVal1 = bVal.byteValue();
		System.out.println(bVal1);

		String s2 = "200";
		Short sVal = new Short(s2);
		short sVal1 = sVal.shortValue();
		System.out.println(sVal1);

		String s3 = "300";
		Integer iVal = new Integer(s3);
		int iVal1 = iVal.intValue();
		System.out.println(iVal1);

		String s4 = "400011254545445";
		Long lVal = new Long(s4);
		long lVal1 = lVal.longValue();
		System.out.println(lVal1);

		String s5 = "3.14f";
		Float fVal = new Float(s5);
		float fVal1 = fVal.floatValue();
		System.out.println(fVal1);

		String s6 = "3.90000000";
		Double dVal = new Double(s6);
		double dVal1 = dVal.doubleValue();
		System.out.println(dVal1);

		String s7 = "true";
		Boolean boolVal = new Boolean(s7);
		boolean boolVal1 = boolVal.booleanValue();
		System.out.println(boolVal1);
	}

}
