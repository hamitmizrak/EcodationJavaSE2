package com.ecodation1.ornekler;

import java.util.Scanner;

public class CiftTek {

	public static void main(String[] args) {
		while (true) {
			secim();

		}

	}

//se�im metodu
	private static void secim() {
		int secim;
		Scanner klavye = new Scanner(System.in);
		System.out.println("\nL�tfen se�im yap�n�z");
		System.out.println("1. tek �ift hesapla");
		System.out.println("2. ��k�� yaps�n");
		secim = klavye.nextInt();
		switch (secim) {
		case 1:
			System.out.println("hesapla yap�lacak");
			sayiTekCift();
			break;

		case 2:
			System.out.println("��k�� yap�l�yor ....");
			System.exit(0);
			break;

		default:
			break;
		}
	}

	// Metot
	private static void sayiTekCift() {
		int sayi;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		sayi = klavye.nextInt();

		if (sayi % 2 == 0) {
			System.out.println("say� �ifttir");
		} else {
			System.out.println("Say� tektir");
		}

	}

}
