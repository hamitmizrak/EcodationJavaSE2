package com.ecodation1.ornekler;

import java.util.Scanner;

public class TekBilinmeyenliDenkler {

	public static void main(String[] args) {
		// x = 4y + 5k;
		Scanner klavye = new Scanner(System.in);
		int y, k, sonuc;
		System.out.println("Lütfen y değerini giriniz.");
		y = klavye.nextInt();

		System.out.println("Lütfen k değerini giriniz.");
		k = klavye.nextInt();

		sonuc = 4 * y + 5 * k;
		System.out.println(sonuc);

	}
}
