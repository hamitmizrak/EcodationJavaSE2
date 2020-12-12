package com.ecodation1.ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class Example014_Sifir {
	/*
	 * Kullanıcıdan klavyeden Sıfır(0) sayısı girene kadar klavyeden girilecek
	 * algoritma. Sıfır girilene kadar bu sayılarında; en küçüğü En büyüğü
	 * Toplamları Ortalaması Deneme sayısı
	 * 
	 */

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi2, counter = 0, toplam = 0;
		double ortalama = 0.0;

		int[] dizi = new int[10];

		while (2 > 1) {
			System.out.println("Lütfen sayı giriniz");
			sayi2 = klavye.nextInt();
			if (sayi2 == 0) {
				System.out.println("Sıfır girdiniz iyi günler");
				// System.exit(0);
				break;
			} else if (sayi2 == 5) {
				System.out.println("5 dahil etmiyorum.");
				continue;
			} else {

				counter++;
				toplam += sayi2;
				ortalama = toplam / counter;

				dizi[counter] = sayi2;
			}
			System.err.println("Deneme sayısı:" + counter);
			System.err.println("Toplam:" + toplam);
			System.err.println("Ortalama: " + ortalama);

		}

		for (int temp : dizi) {
			System.out.println("Sayılar:" + temp);
		}

		Arrays.sort(dizi);
		int enKucuk = 0, enBuyuk = 0;
		for (int i = 0; i < dizi.length; i++) {
			enKucuk = dizi[0];
			enBuyuk = dizi[dizi.length - 1];
		}
		System.out.println("En küçük:" + enKucuk);
		System.out.println("En büyük:" + enBuyuk);
	}
}
