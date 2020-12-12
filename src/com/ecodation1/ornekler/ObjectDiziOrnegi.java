package com.ecodation1.ornekler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ObjectDiziOrnegi {
	// 5
	// 1<=x<=5
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		System.out.println("Bir say� giriniz");
		sayi = klavye.nextInt();
		randomMetodu(sayi);

	}

	private static void randomMetodu(int sayi) {
		Random rnd = new Random();
		int randomSayi;
		int[] dizi = new int[sayi];
		for (int i = 0; i < dizi.length; i++) {
			randomSayi = rnd.nextInt(sayi) + 1; // 1 <=x<= sayi
			dizi[i] = randomSayi;

		}

		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}

		System.out.println("\nilk say�: " + dizi[0]);
		System.out.println("sonsay�: " + dizi[sayi - 1]);
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {

				System.out.print(dizi[i] + " ");
			}
		}

	}
}
