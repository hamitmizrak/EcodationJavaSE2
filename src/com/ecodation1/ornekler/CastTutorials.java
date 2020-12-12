package com.ecodation1.ornekler;

public class CastTutorials {

	public static void main(String[] args) {
		// Casting
		float f2 = 14.53f;
		float f3 = (float) 14.53;

		// b > s > i > l
		byte b2 = 5;
		long l2 = b2;

		long l3 = 45L;
		short s3 = (short) l3;

		// String >> int
		String str = "44";

		// Nesne düzeyinde cast
		int i4 = Integer.valueOf(str);
		System.out.println(44 + i4);

		// daha hızlı
		int i5 = Integer.parseInt(str);
		System.out.println(44 + i5);

		// int >> String
		int i6 = 66;
		String str6 = String.valueOf(i6);
		System.out.println(34 + str6);

		// daha hızlı
		String str7 = Integer.toString(i6);
		System.out.println(34 + str7);

		// boxing=primitiveden wrapper cevirdim.
		int primitive = 55;
		Integer buyuk = primitive;

		// UnBoxing
		Integer wrapperClass = new Integer(34);
		int primitive4 = wrapperClass;

	}
}
