package com.ecodation1.ornekler;

import java.util.Scanner;

public class DiziExample012_Math {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int sayi2, sayi3;
		double result;
		System.out.println("1.sayıyı giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("2.sayıyı giriniz");
		sayi3 = klavye.nextInt();
		System.out.println("En küçük sayı: " + Math.min(sayi2, sayi3));
		System.out.println("En büyük sayı: " + Math.max(sayi3, sayi2));
		System.out.println("Üslü: " + Math.pow(sayi2, sayi3));
		result = Math.max(sayi3, sayi2);
		System.out.println("Karakök: " + Math.sqrt(result));
		System.out.println("Mutlak: " + Math.abs(-result));

	}
}
