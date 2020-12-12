package com.ecodation2.ornek;

import java.util.Scanner;

public class Ornekler015_HesapMakinesi {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
//Kullanıcda veriler istensin
		int karar;
		double sayi2, sayi3, sonuc = 0;
		System.out.println("****Hesap Makinenesi*****");

		while (true) {
			System.out.println("");
			System.err.println("1-)Toplama\n2-)Cikarma\n3-)Çarpma\n4-)Bölme\n5-)Çıkış");
			karar = klavye.nextInt();
			System.out.println(" ");

			System.out.println("Lütfen 1.sayıyı giriniz");
			sayi2 = klavye.nextDouble();

			System.out.println("Lütfen 2.sayıyı giriniz");
			sayi3 = klavye.nextDouble();

			switch (karar) {
			case 1:
				System.out.println("Toplama işlemi");
				sonuc = sayi2 + sayi3;
				System.err.println("toplama sonucu: " + sonuc);
				System.out.println();
				break;
			case 2:
				System.out.println("Çikarma işlemi");
				sonuc = sayi2 - sayi3;
				System.err.println("çikarma sonucu: " + sonuc);
				System.out.println();
				break;
			case 3:
				System.out.println("Çarpma işlemi");
				sonuc = sayi2 * sayi3;
				System.err.println("çarpma sonucu: " + sonuc);
				System.out.println();
				break;
			case 4:
				System.out.println("Bölme işlemi");
				sonuc = sayi2 / sayi3;
				System.err.println("bölme sonucu: " + sonuc);
				System.out.println();
				break;
			case 5:
				System.out.println("Çıkış yapılıyor....");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilen aralıktaki sayı giriniz");
				break;
			}
		}

	}
}
