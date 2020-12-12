package com.ecodation1.ornekler;

import java.util.Scanner;

public class Example015_Faktoriyel {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bulmak istediğiniz faktöriyel sayısını giriniz");
		int sayi;
		sayi = klavye.nextInt();
		iterativeFaktoriyel(sayi);
	}

	public static void iterativeFaktoriyel(int sayi) {
		int result = 1;

		if (sayi == 0) {
			System.out.println("Sıfır girdiniz");
			System.exit(0);
		} else if (sayi < 0) {
			System.out.println("Negatif bir değer giremezsiniz");
			// continue;
			// break;
		} else {
			for (int i = sayi; i > 1; i--) {
				result = result * i;
			}
		}

		System.out.println(sayi + " sayının faktöriyeli: " + result);

	}
}
