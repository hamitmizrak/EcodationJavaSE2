package com.ecodation2.ornek;

import java.util.Scanner;

public class Ornekler005_Ternary {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Haftanın günleri için bir sayı giriniz");
		int sayi = klavye.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("pazartesi");
			break;

		case 2:
			System.out.println("salı");
			break;

		case 3:
			System.out.println("çarşamba");
			break;

		case 4:
			System.out.println("perşembe");
			break;

		case 5:
			System.out.println("cuma");
			break;

		case 7:
			System.out.println("pazar");
			break;
		case 6:
			System.out.println("cumartesi");
			break;

		default:
			System.out.println("Lütfen belirtilen aralıktaki sayıyı giriniz");

			break;
		}

		// if else
		if (sayi == 1) {
			System.out.println("pazartesi ifelse");
		} else if (sayi == 2) {
			System.out.println("salı ifelse");
		} else if (sayi == 3) {
			System.out.println("çarşamba ifelse");
		} else if (sayi == 4) {
			System.out.println("perşembe ifelse");
		} else if (sayi == 5) {
			System.out.println("cuma ifelse");
		} else if (sayi == 7) {
			System.out.println("pazar ifelse");
		} else if (sayi == 6) {
			System.out.println("cumartesi ifelse");
		} else {
			System.out.println("Lütfen belirtilen aralıktaki sayıyı giriniz");
		}
	}
}
