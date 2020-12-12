package com.ecodation2.dersler;

import java.util.Scanner;

public class Ders007_Scanner {
	public static void main(String[] args) {
		// System.out.println("ekran çıktısı");

		Scanner klavye = new Scanner(System.in);

		System.out.println("Adınızı giriniz");
		String kelime = klavye.nextLine(); // String
		System.out.println("adınız: " + kelime);

		System.out.println("Bildiğiniz dil sayısı");
		int diller = klavye.nextInt();
		System.out.println("bildiğiniz diller: " + diller);
		// klavye.next(); // o satırda kalıyor inline

		klavye.close();
	}

}
