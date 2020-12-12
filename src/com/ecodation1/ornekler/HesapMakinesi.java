package com.ecodation1.ornekler;

import java.util.Scanner;

public class HesapMakinesi {
	Scanner klavye = new Scanner(System.in);
	int sayi1, sayi2;

	public void secim() {
		while (true) {
			System.out.println("Lütfen bir seçim yapınız");
			System.out.println("1 toplama\n2 cıkarma\n3 çarpma \n4 bölme \n5 cıkıs");
			int secim;
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println("toplama için 1. sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("toplama için 2. sayıyı giriniz");
				sayi2 = klavye.nextInt();
				System.out.println("toplam sonucu: " + (sayi1 + sayi2) + "\n");
				break;

			case 2:
				System.out.println("çıkarma ...");
				System.out.println("cıkarma için 1. sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("cıkarma için 2. sayıyı giriniz");
				sayi2 = klavye.nextInt();
				System.out.println("cıkarma sonucu: " + (sayi1 - sayi2) + "\n");
				break;

			case 3:
				System.out.println("çarpma ...");
				System.out.println("carpma için 1. sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("carpma için 2. sayıyı giriniz");
				sayi2 = klavye.nextInt();
				System.out.println("çarpma sonucu: " + (sayi1 * sayi2) + "\n");
				break;

			case 4:
				System.out.println("bölme işlemi.");
				System.out.println("bölme için 1. sayıyı giriniz");
				sayi1 = klavye.nextInt();
				System.out.println("bölme için 2. sayıyı giriniz");
				sayi2 = klavye.nextInt();
				System.out.println("bölme sonucu:" + (sayi1 / sayi2) + "\n");
				break;

			case 5:
				System.out.println("Çıkış yapılıyor.");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilenleri seçiniz.");
				break;
			}
		}

	}

}
