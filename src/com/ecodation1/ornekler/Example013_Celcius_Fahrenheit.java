package com.ecodation1.ornekler;

import java.util.Scanner;

public class Example013_Celcius_Fahrenheit {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi2;
		double result;

		System.out.println("Dereceyi giriniz");
		sayi2 = klavye.nextInt();

		result = (sayi2 * 9 / 5) + 32;
		System.out.println("Derece: " + sayi2 + " Fahrenheit: " + result);

	}
}
