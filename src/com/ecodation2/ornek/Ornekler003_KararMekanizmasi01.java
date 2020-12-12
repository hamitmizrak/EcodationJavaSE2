package com.ecodation2.ornek;

import java.util.Scanner;

public class Ornekler003_KararMekanizmasi01 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("1 ile 4 arasında bir sayı giriniz");
		int sayi = klavye.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("girdiğiniz sayı 1 dir");
			break;

		case 2:
			System.out.println("girdiğiniz sayı 2 dir");
			break;

		case 4:
			System.out.println("girdiğiniz sayı 4 dir");
			break;

		case 3:
			System.out.println("girdiğiniz sayı 3 dir");
			break;

		default:
			System.out.println("Lütfen belirtilen aralıktaki sayıyı giriniz");

			break;
		}
	}
}
