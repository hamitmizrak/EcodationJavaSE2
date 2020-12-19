package com.ecodation.randomuuid2;

import java.util.Scanner;
import java.util.UUID;

public class RandomUUIDClass {

	// benzersiz bir id oluştur
	public String uuidMethod() {
		UUID randomuuid = UUID.randomUUID(); // 32 bit
		String toString = String.valueOf(randomuuid);
		return toString;
	}

	// database yazsın
	public void dbWrite(String gelenUUID) {
		System.out.println("Database kaydedildi: " + gelenUUID);
	}

	// telefon
	public String telephoneSend(String gelenUUID) {
		System.out.println("Telefonunuza id gönderildi  " + gelenUUID);
		return gelenUUID;
	}

	// mail yoluyla
	public String mailSend(String gelenUUID) {

		System.out.println("Mailiniz gönderildi.");
		return gelenUUID;
	}

	// mail okuma
	public String mailOpen(String gidenUUID) {
		System.out.println("Lütfen mail doğrulamak için tıklayınız");
		return gidenUUID;
	}

	// Admin onaylaması lazım
	public boolean adminAccess() {
		System.out.println("Admin onaylanması bekleniyor.");
		boolean adminOnaylama = true; // =false;
		return adminOnaylama;
	}

	// login
	public void login(boolean result) {
		// admin onaylamışsa
		if (result) {
			String dbKullaniciAdi = "root", dbSifre = "root";
			String kullaniciAdi, kullaniciSifre;
			Scanner klavye = new Scanner(System.in);

			System.out.println("Lütfen kullanıcı adınızı giriniz");
			kullaniciAdi = klavye.nextLine();

			System.out.println("Lütfen kullanıcı şifrenizi giriniz");
			kullaniciSifre = klavye.nextLine();

			if ((kullaniciAdi.equals(dbKullaniciAdi)) && (kullaniciSifre.equals(dbSifre))) {
				System.out.println("Sayfanıza yönlendiriliyorsunuz");
			} else {
				System.out.println("Kullanıcı adı veya şifreniz yanlış");
			}
		}

	}

}
