package com.ecodation1.ornekler;

public class PrimitiveBoxingUnboxing {

	public static void main(String[] args) {

//		BOXİNG
		int primitive = 45;
		System.out.println("primitive: " + primitive);
		Integer wrapperClass = primitive;
		System.out.println("wrapper: " + wrapperClass);

		// UNBOXİNG
		Double doubleVariable = new Double(44.44);
		double doublePrimitive = doubleVariable;
		System.out.println(doublePrimitive);

	}
}
