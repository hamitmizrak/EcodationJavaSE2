package com.ecodation2.dersler;

import java.util.Arrays;

public class Ders24_diziler {

	public static void diziExample() {

		int sayi = 5;
		int sayi2 = 9;
		int sayi4 = 5;
		int sayi6 = 6;

		int[] diziAdi = new int[4];
		int diziAdi9[] = new int[4]; // dizi adını başa yazabiliriz.
		// diziler sıfırdan başlar
		diziAdi[0] = 5;
		diziAdi[1] = 9;
		diziAdi[2] = 5;
		diziAdi[3] = 6;

		int[] sayilar = new int[10000];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i] = i);
		}

		System.out.println("6.indis" + sayilar[5]);
		System.out.println(sayilar[0] + sayilar[sayilar.length - 1]);

		Arrays.sort(diziAdi);
		// Arrays.binarySearch(a, key)

	}

	public static void siralama() {
		int[] diziAdi = new int[4];
		// diziler sıfırdan başlar
		diziAdi[0] = 5;
		diziAdi[1] = 9;
		diziAdi[2] = 1;
		diziAdi[3] = 6;
		Arrays.sort(diziAdi);
		for (int temp : diziAdi) {
			System.out.println(temp);
		}
	}

	public static void arama() {
		int[] diziAdi = new int[4];
		// diziler sıfırdan başlar
		diziAdi[0] = 5;
		diziAdi[1] = 9;
		diziAdi[2] = 1;
		Arrays.sort(diziAdi);
		int result = Arrays.binarySearch(diziAdi, 1);
		if (result < 0) {
			System.out.println("aradığınız yoktur");
		} else {
			System.out.println("Aradığınız bulunuyor");
		}
		System.out.println(result);
		for (int temp : diziAdi) {
			System.out.println(temp);
		}
	}

	public static void diziKarsilastirma() {
		int[] dizi1 = { 1, 2, 3 };
		int[] dizi2 = { 1, 2, 3, 4 };
		if (Arrays.equals(dizi1, dizi2)) {
			System.out.println("Diziler eşittir");
		} else {
			System.err.println("diziler eşit değildir");
		}
	}

	public static void uzayHatasi() {
		int[] diziAdi = new int[4];
		// indis sıfırdan başlar unutma
		diziAdi[0] = 5;
		diziAdi[1] = 9;
		diziAdi[2] = 1;
		diziAdi[3] = 6;
		System.out.println(diziAdi[5]); // arraysIndexOutOfBoundsException
	}

	public static void arrayCall() {
		// int[] diziAdi = new int[4];
		int[] diziAdi = { 4, 5, 6, 2, 1, 0 };
		Arrays.sort(diziAdi);
		for (int temp : diziAdi) {
			System.out.println(temp);
		}
	}

	public static void arrayCallObject() {
		// int[] diziAdi = new int[4];
		int[] diziAdi = { 4, 5, 6, 2, 1, 0 };
		Arrays.sort(diziAdi);
		for (Object temp : diziAdi) {
			System.out.println(temp);
		}
	}

	public static void matrixCall() {
		// int[] diziAdi = new int[4];
		// int[][] diziAdi = new int[2][3]; // 2 satır 3 sutun
		int[][] diziAdi = new int[2][2]; // 2 satır 2 sutun
		diziAdi[0][0] = 1;
		diziAdi[0][1] = 2;
		diziAdi[1][0] = 3;
		diziAdi[1][1] = 4;
		for (int i = 0; i < 2; i++) { // satır
			for (int r = 0; r < 2; r++) { // sutun
				System.out.print(diziAdi[i][r] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// diziExample();
		// siralama();
		// uzayHatasi();
		// arrayCall();
		// matrixCall();
		// arrayCallObject();
		// arama();
		diziKarsilastirma();
	}
}
