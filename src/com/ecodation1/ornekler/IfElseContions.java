package com.ecodation1.ornekler;

public class IfElseContions {

	public static void main(String[] args) {

		boolean karar = 2 > 1;

		if (karar) {
			System.out.println("doğru");
			System.out.println("birden fazla");
		} else {
			System.out.println("yanliş");
		}

		// curl brackets
		if (2 > 1) {
			System.out.println("doğru Ecodation");
		}

		System.out.println("diğer yapı");

		// multi conditions
		int x = 4;
		if (x == 1) {
			System.out.println("sayi 1");
		} else if (x == 2) {
			System.out.println("sayi 2");
		} else if (x == 3) {
			System.out.println("sayi 3");
		} else if (x == 5) {
			System.out.println("sayi 5");
		} else if (x == 6) {
			System.out.println("sayi 6");
		} else if (x == 7) {
			System.out.println("sayi 7");
		} else if (x == 3) {
			System.out.println("sayi 3");
		} else {
			System.out.println("sayi 4 tür");
		}

		// Ternary
		int x2, y2;
		x2 = 5;
		y2 = 10;
		String sonuc = x2 > y2 ? " x büyüktür" : "küçüktür";
		System.out.println(sonuc);

		System.out.println("Switch Case");
		// Switch case
		int key = 10;
		switch (key) {
		case 1:
			System.out.println("sayı 1");
			break;
		case 2:
			System.out.println("sayı 2");
			break;

		case 3:
			System.out.println("sayı 3");
			break;
		case 4:
			System.out.println("sayı 4");
			break;
		case 5:
			System.out.println("sayı 5");
			break;
		default:
			System.out.println("aradığınız sayı bu değildir.");
			break;
		}

	}
}
