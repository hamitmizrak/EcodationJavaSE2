package com.ecodation1.ornekler;

import java.util.Scanner;

public class MilKm {
	public static void main(String[] args) {
		milKm();
	}

	public static void milKm() {
		Scanner klavye = new Scanner(System.in);
		int secim;

		while (true) {
			System.out.println("\nMil Km hesaplama");
			System.out.println("1-)Hesapla\n2-)Çıkış");
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println("hesaplama");
				hesapla();
				break;
			case 2:
				System.out.println("çıkılıyor ");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilen aralıkta seçim yapınız.");
				break;
			}
		}
	}

	private static void hesapla() {
		Scanner klavye = new Scanner(System.in);
		System.err.println("Mil sayısı giriniz");
		double secim, km, metre, adim, ayakSesi;
		secim = klavye.nextInt();
		km = secim * 1.609;
		metre = secim * 1609.344;
		adim = secim * 1.600;
		ayakSesi = secim * 2000;
		System.out.println(secim + " mil " + km + " km eder");
		System.out.println(secim + " mil " + metre + " metre eder");
		System.out.println(secim + " mil " + adim + " adim eder");
		System.out.println(secim + " mil " + ayakSesi + " ayak sesi eder");

	}
}
