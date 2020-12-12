package com.ecodation2.dersler;

import java.util.Scanner;

public class Ders019_Metot {

	public static void main(String[] args) {
		// metotAdi(34, "İstanbul", 23.23);

		// Kelime dönsün onun için malatya geçiyorsa geçtiğini söylesin.
		/*
		 * String bulmak = kelime(); if (bulmak.contains("malatya")) {
		 * System.out.println("Evet aradığınız kelime var"); } else {
		 * System.out.println("Yoktur."); }
		 */

		// static olmadan çağırma
		// sınıf.metotAdi();
		Ders019_Metot sinif = new Ders019_Metot();
		int sonuc = sinif.toplaMetodu(4, 6);
		System.out.println(sonuc);

	}

	// public protected private
	// static durağan
	// void demek geriyebirşey dönderme yani o işlem o metotda başlasın ve bitsin
	// metotAdi=camel case
	// () parametreler
	public static void metotAdi(int k, String m, double f) {
//		k = 5;
//		m = "Hamit Mızrak";
//		f = 44.34;
		System.out.println("sayı=" + k);
		System.out.println("kelime=" + m);
		System.out.println("virgül=" + f);
	}

	public static String kelime() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle = klavye.nextLine();

		return cumle;

	}

	private int toplaMetodu(int x, int y) {
		int result = x + y;
		return result;
	}

}
