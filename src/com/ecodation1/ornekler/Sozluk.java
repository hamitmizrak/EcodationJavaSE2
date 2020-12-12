package com.ecodation1.ornekler;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sozluk {

	public static void main(String[] args) {

		secim();
	}

	private static void dizinOlustur() {
		String path = "C:\\2020_Ecodation Java SE\\file\\sozluk.txt";
		File file = new File(path);
		if (file.exists()) {
			System.out.println("Bu dosya bulunmaktadır.");
			System.out.println(file.getName());
		} else {
			System.out.println("klasor oluşturuldu.");
		}

	}

	// map oluşturdum.
	public static Map<String, String> mapList = new HashMap<String, String>();

	public static void secim() {
		Scanner klavye = new Scanner(System.in);
		int secim;
		while (true) {
			System.out.println("\nEcodation Sözlük uygulaması\n");
			System.out.println("1-)Ekle\n2-)Sil\n3-)Liste\n4-)Çıkış");
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println(" ");
				kelimeEkle();
				break;
			case 2:
				System.out.println(" ");
				kelimeSil();
				break;
			case 3:
				System.out.println(" ");
				kelimeListele();
				break;
			case 4:
				System.out.println("Çıkış yapılıyor....");
				System.exit(0);
				break;

			default:
				System.out.println("Lütfen belirtilen aralıkta seçim yapınız.");
				break;
			}
		}
	}

	private static void kelimeListele() {

		for (String key : mapList.keySet()) {
			String value = mapList.get(key);
			System.err.println(key + " " + value);
		}
	}

	private static void kelimeSil() {
		Scanner klavye = new Scanner(System.in);
		String Id;
		System.out.println("Lütfen silmek istediğiniz ID giriniz");

		for (String key : mapList.keySet()) {
			System.err.println(key);
		}
		Id = klavye.nextLine();
		mapList.remove(Id);
		System.out.println("Silinen: " + Id);

	}

	private static void kelimeEkle() {
		Scanner klavye = new Scanner(System.in);
		String turkce, ingilizce;

		System.out.println("Türkçe kelime giriniz");
		turkce = klavye.nextLine();

		System.out.println("İngilizcesi giriniz.");
		ingilizce = klavye.nextLine();
		// sozlukDao()
		mapList.put(turkce, ingilizce);

	}
}
