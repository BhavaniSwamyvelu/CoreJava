package com.bhavani.factorydesignpatterns1;

public class EndUser {
	public static void main(String[] args) {

		CalcImpl ref=new CalcImpl();
		System.out.println(ref);
		ref.get(ref);
		
	}
}
