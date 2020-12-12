package com.ecodation1.ornekler;

import java.util.Scanner;

public class SayiTahmin {
	public static void main(String[] args) {
		sayiTahmin();
	}

	private static void sayiTahmin() {
		Scanner klavye = new Scanner(System.in);
		int tahmin, kalanHak = 10, rnd, counter = 0;
		String karar;
		rnd = (int) (Math.random() * 100 + 1);
		System.out.println(rnd);
		System.out.println("1 ile 100 Sayi tahmin ediniz");
		int[] dizi = new int[10];
		while (true) {
			System.out.println("tahmin sayısınızı giriniz");
			tahmin = klavye.nextInt();
			for (int i = 0; i < dizi.length; i++) {
				dizi[counter] = tahmin;
				counter++;
				break;

			}

			if (rnd > tahmin) {
				System.err.println("\nküçük sayı girdiniz büyük sayi girmelisiniz");
				int son = rnd - tahmin;
				if (son > 10) {
					System.out.println("arada fark çok büyük");
				}
				kalanHak--;
				System.out.println("kalan hakkınız: " + kalanHak);

			} else if (rnd < tahmin) {
				System.err.println("\nbüyük sayı girdiniz küçük sayı girmelisiniz.");
				int son = tahmin - rnd;
				if (son > 10) {
					System.out.println("arada fark çok büyük");
				}
				kalanHak--;
				System.out.println("kalan hakkınız: " + kalanHak);

			} else {
				System.out.println("doğru tahmin");
				System.out.println();
				System.out.println((10 - kalanHak) + " .sayida buldunuz");
			}

		}
	}

}
