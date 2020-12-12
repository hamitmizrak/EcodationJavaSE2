package com.ecodation1.ornekler;

import java.util.Scanner;

public class Hipotenus {
	public static void main(String[] args) {
		hipotenus();

	}

	public static void hipotenus() {
		Scanner klavye = new Scanner(System.in);
		int secim;

		while (true) {
			System.out.println("\nHipotenus hesaplama \n");
			System.out.println("1-)Hesapla\n2-)Çıkış");
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println(" hesaplama");
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
		int kenar1 = 1, kenar2 = 1;
		double sonuc;
		System.out.println("1. Dik kenar giriniz sayısı giriniz");
		kenar1 = klavye.nextInt();
		System.out.println("2. Dik kenar sayısı giriniz");
		kenar2 = klavye.nextInt();

		sonuc = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));

		System.err.println("Hipotenus sonuç:" + sonuc);

	}
}
