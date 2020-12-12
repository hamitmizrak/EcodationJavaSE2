package com.ecodation1.ornekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TelefonRehberi {
	Scanner klavye = new Scanner(System.in);
	List<Long> alanKoduList = new ArrayList<Long>();
	Long numara;

	public void secim() {
		while (true) {
			System.out.println("Lütfen bir seçim yapınız");
			System.out.println(
					"1 Telefon numarası  ekle\n2 Telefon numarası sil\n3 rastgele birisini ara\n4 Numaları listele\n5 çıkış\n");
			int secim;
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Telefon numarası eklenecek ...");
				telefonNumaraEkle();
				break;

			case 2:
				System.out.println("Telefon numarası silme ...");
				telefonNumaraCikar();
				break;

			case 3:
				System.out.println("rastgele arama yapılıyor.");
				telefonNumaraRastgele();
				break;

			case 4:
				System.out.println("Listeleniyor ...");
				telefonNumaraListele();
				break;

			case 5:
				System.out.println("Çıkış yapılıyor.");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilenleri seçiniz.");
				break;
			}
		}

	}

	public void telefonNumaraListele() {
		for (Long temp : alanKoduList) {
			System.out.println(temp);
		}
		System.out.println("-----------------\n");

	}

	public void telefonNumaraEkle() {
		System.out.println("numarayı giriniz");
		numara = klavye.nextLong();
		alanKoduList.add(numara);
		System.out.println("Eklendi");
		System.out.println("-----------------\n");
	}

	public void telefonNumaraCikar() {
		for (int i = 0; i < alanKoduList.size(); i++) {
			System.out.println(alanKoduList.get(i));
		}

		System.out.println("silmek istediğiniz ID giriniz");
		numara = klavye.nextLong();
		alanKoduList.remove(numara);

		for (Long temp : alanKoduList) {
			System.out.println(temp);
		}
		System.out.println("-----------------\n");
	}

	public void telefonNumaraRastgele() {
		System.out.println("aranıyor.");
		Random rnd = new Random();
		int sonuc = rnd.nextInt(alanKoduList.size());
		System.out.println(alanKoduList.get(sonuc));
		System.out.println("-----------------\n");
	}

}
