package com.ecodation1.ornekler;

import java.util.Random;
import java.util.Scanner;

public class Example005_dizi_ortalama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lufen dizi  eleman icin sayi giriniz");
		int sayi = klavye.nextInt();
		int[] dizi = new int[sayi];

		Random random = new Random();
		int karisik = random.nextInt(3) + 1; // 1<=x<=3

		int toplam = 0;
		double ortalama = 0.0;

		for (int i = 0; i < dizi.length; i++) {
			karisik = random.nextInt(5) + 1; // 1 <=y<=5
			dizi[i] = karisik;
			toplam += dizi[i]; // toplam=toplam+dizi[i];
			// ortalama= toplamları/sayi
			ortalama = toplam / dizi.length;
		}

		for (int temp : dizi) {
			System.out.print(temp);
		}

		System.out.println("\nSayi toplam:" + toplam + " sayi ortalama:" + ortalama);
	}
}
