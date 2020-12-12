package com.ecodation1.ornekler;

import java.util.Random;
import java.util.Scanner;

public class DiziExample002_Random_Methods {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		System.out.println("Lutfen dizi eleman sayi giriniz");
		sayi = klavye.nextInt();
		int[] dizi = new int[sayi];

		// Random
		// Math.random()
		Random random = new Random();
		int karisik = random.nextInt(5) + 1; // 1<=x<=5

		for (int i = 0; i < dizi.length; i++) {
			karisik = random.nextInt(5) + 1;
			dizi[i] = karisik;
		}

		// forEach
		for (int temp : dizi) {
			System.out.print(temp);
		}

		/*
		 * for (int i = 0; i < dizi.length; i++) { dizi[0] dizi }
		 */

		System.out.println("\n\rilk sayi:" + dizi[0] + " son sayi:" + dizi[dizi.length - 1] + " toplamlari="
				+ (dizi[0] + dizi[dizi.length - 1]));
		int x = (dizi[0] + dizi[dizi.length - 1]);
		karsilastir(x);
	}

	public static void karsilastir(int sayi) {

		if (sayi < 10) {
			System.out.println("sayi:" + sayi + " 10 'dan kadar");
		} else {
			System.out.println("sayi 10 buyuk");
		}
	}

}
