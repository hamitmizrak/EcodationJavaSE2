package com.ecodation2.dersler;

public class Ders003_DataTypes2 {

	public static void main(String[] args) {
		System.out.println("Merhabalar Güzel insan");
		// tek satır
		/* çoklu satırlar */

		// data types = 2 bölünür
		// 1-)primitive (ilkel tipler)
		// 2-)gelişmiş (wrapper tipler)

		// ilkel tipler
		// Tam sayılar
		// b > s >i > l
		// f L
		byte b1 = 127; // -127 <= x <= 127
		short s1 = 12345;
		int i1 = 1234567890;
		long l1 = 1234567890123456789L;

		// virgüllü sayılar
		// f > d
		float f2 = 14.52f;
		double d2 = 1455.552;

		// boolean = karar
		boolean b2 = true;
		b2 = false;
		b2 = 1 > 5;

		// characters
		char c4 = 's';
		char c3 = '\u1458';
		System.out.println(c3);

	}

}
