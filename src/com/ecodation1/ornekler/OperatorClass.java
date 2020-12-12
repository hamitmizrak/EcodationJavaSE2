package com.ecodation1.ornekler;

public class OperatorClass {
	public static void main(String[] args) {
		// Atama operatörü
		int degisken = 5;
		// degisken = degisken + 8;
		degisken += 8;
		// degisken -= 8;
		// degisken *= 8;
		// degisken /= 8;
		// degisken %= 8;
		System.out.println(degisken + "\n");

		// Aritmetics operators
		System.out.println(13 + 5);
		System.out.println(13 - 5);
		System.out.println(13 * 5);
		System.out.println(13 / 5);
		System.out.println(13 % 5);
		System.out.println("");

		// İlişkisel operatör
		System.out.println(13 <= 5);
		System.out.println(!true);

		// Mantıksal operatörler
		// bitsel kelimesel
		System.out.println(2 > 1 & 10 < 5);
		System.out.println(2 < 1 | 10 < 5);

		// Kaydırma
		System.out.println(1 << 3);

		System.out.println((3 + 5 * 2) * 2);

	}
}
