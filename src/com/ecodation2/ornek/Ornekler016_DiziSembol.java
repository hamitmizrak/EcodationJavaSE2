package com.ecodation2.ornek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ornekler016_DiziSembol {

	public static void SingleSembolGoster() {
		Scanner klavye = new Scanner(System.in);
		int satir, sayi1, sayi2, sayi3;

		System.out.println("Lütfen satır sayısı giriniz");
		satir = klavye.nextInt();

		System.out.println("1. sayı giriniz");
		sayi1 = klavye.nextInt();

		System.out.println("2. sayı giriniz");
		sayi2 = klavye.nextInt();

		System.out.println("3. sayı giriniz");
		sayi3 = klavye.nextInt();

		int[] dizi = new int[satir];
		dizi[0] = sayi1;
		dizi[1] = sayi2;
		dizi[2] = sayi3;
		for (Object temp : dizi) {
			System.out.println(temp);
		}
	}

	public static void even() {

		int[] dizi = { 0, 1, 2, 3, 4 };
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {
				System.out.println("Çift sayıdır" + dizi[i]);
			}
			if (dizi[i] % 2 != 0) {
				System.out.println("tek sayıdır" + dizi[i]);
			}

		}

	}

	public static void newExamplesArray() {
		/*
		 * konsoldan kaç elemanlı elemanlı bir dizi olacak bu elemanlara rastgele
		 * sayılar girilecek -a) ilk sayı ile son sayının toplamını alalım. -b) metota
		 * verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol
		 * edecek.
		 * 
		 */
		Scanner klavye = new Scanner(System.in);
		int satir, baslangic, bitis;
		Random rnd = new Random();

		System.out.println("Lütfen dizi için elaman sayısı giriniz");
		satir = klavye.nextInt();

		System.out.println("Lütfen başlangıç değerini   giriniz");
		baslangic = klavye.nextInt();

		System.out.println("Lütfen bitiş değerini   giriniz");
		bitis = klavye.nextInt();

		int[] dizi = new int[satir];
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			int karisik = rnd.nextInt(bitis) + baslangic;
			dizi[i] = karisik;
		}

		// foreach
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}

		System.out.println("İlk sayı: " + dizi[0]);
		System.out.println("son sayı: " + dizi[dizi.length - 1]);

	}

	public static void main(String[] args) {
		// SingleSembolGoster();
		newExamplesArray();

	}

}
