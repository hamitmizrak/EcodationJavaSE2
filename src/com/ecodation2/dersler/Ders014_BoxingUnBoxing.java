package com.ecodation2.dersler;

public class Ders014_BoxingUnBoxing {
	public static void main(String[] args) {
//cast = dönüştürmek demektir
		// CAST 1-)
		// f -L
		float f1 = 4.5f;
		long l2 = 4515L;

		// CAST 2-) küçük sayıyı büyük sayıya atama , büyük sayıyı küçük sayıya atama
		// b < s < i < l
		// küçük sayıyı büyük sayıya yerleştirdim veri kaybı yoktur
		byte b5 = 45;
		long l5 = b5;

		// Büyük bir sayıyı küçük bir sayıya yerleştirmek
		int i6 = 852;
		byte b6 = (byte) i6;

		// CAST 3-)
		// System.out.println("6" + 6);
		// System.out.println(6 + 6);
		// String to int
		String str = "7";
		int strConvert = Integer.valueOf(str);
		int sayi = 7;
		int result = strConvert + sayi;
		System.out.println(result);

		// int sayısında String'e çevirme
		int sayi5 = 14;
		String s1 = String.valueOf(sayi5);

		// CAST-4 boxing unboxing
		// Bazen obje düzeyinde çalışmak isteyebiliriz.
		// boxing:primitive'den Wrapper çevirmek
		int primitiveValue = 55;
		Integer WrapperValue = primitiveValue; // Boxing

		// unboxing
		Double wrapperDouble = new Double(44.34);
		double primitiveDouble = wrapperDouble; // unboxing
		// Neden Boxing yaptığımızın sorusu: Objeye null verebilirim.
		wrapperDouble = null;
		// primitiveDouble = null; // primitivelere null veremezsin

	}

}
