package com.ecodation2.ornek;

import java.util.Scanner;

public class Ornekler014_Faktoriyel {

	public static void main(String[] args) {
		// kullanıcıda bir sayı istensin onun faktoriyel hesaplamasın yapsın
		// 4! =24
		// 4.3.2.1=24
		// Dikkat faktöriyel: sayıyı 1 başlatacağız
		// geçici bir hafıza olması gerekiyor.

		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen faktöriyel hesaplaması için\nbir sayı giriniz");
		int user = klavye.nextInt();

		int carpmimSonucu = 1;

		for (int i = 1; i <= user; i++) {
			carpmimSonucu = carpmimSonucu * i;
			// System.out.print(carpmimSonucu + " ");
		}
		System.err.print(user + " sayısının faktöriyel hesaplaması sonucu: " + carpmimSonucu);

	}
}
