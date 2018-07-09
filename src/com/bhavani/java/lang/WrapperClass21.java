package com.bhavani.java.lang;

public class WrapperClass21 {
	public static void main(String[] args) {
		String s1 = "100";
		byte bVal = Byte.parseByte(s1);
		System.out.println(bVal);

		String s2 = "200";
		short sVal = Short.parseShort(s2);
		System.out.println(sVal);

		String s3 = "300";
		int iVal = Integer.parseInt(s3);
		System.out.println(iVal);

		String s4 = "400011254545445";
		long lVal = Long.parseLong(s4);
		System.out.println(lVal);

		String s5 = "3.14f";
		float fVal = Float.parseFloat(s5);
		System.out.println(fVal);

		String s6 = "3.90000000";
		double dVal = Double.parseDouble(s6);
		System.out.println(dVal);

		String s7 = "true";
		boolean boolVal = Boolean.parseBoolean(s7);
		System.out.println(boolVal);

	}

}
