package com.ecodation1.ornekler;

public class ThrowClass {

	public static void main(String[] args) {

		// int sonuc = 5 / 0;
		// throw new ArithmeticException("Sayıyı sıfıra bölemezsin.");
		// System.out.println();

		System.out.println("asdsad");

		try {
			int sonuc = 5 / 0;
			System.out.println(sonuc);
		} catch (Exception e) {
			System.out.println("Hata oluştu: 1252 ");
			throw new ArithmeticException("dsfsdfsdf");
		}

		System.out.println("Merhabalar");

		// sipariş veriyorsunuz + Kargo + Para veriyor. + havuzdaki para Satıcıccay
	}
}
