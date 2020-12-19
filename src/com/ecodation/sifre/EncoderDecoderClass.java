package com.ecodation.sifre;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class EncoderDecoderClass {

	public static String klavyeMethod() {
		String kelime;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen şifrelecek bir kelime giriniz");
		kelime = klavye.nextLine();
		System.out.println("--------");

		return kelime;

	}

	public static String encoderMethod(String sifrelenecekKelime) {
		Encoder encoder64 = Base64.getEncoder();
		String sifreledim = encoder64.encodeToString(sifrelenecekKelime.getBytes());
		return sifreledim;
	}

	public static String decoderMethod(String cozulecekKelime) {
		Decoder decoder64 = Base64.getMimeDecoder();
		String cozuldu = new String(decoder64.decode(cozulecekKelime));
		return cozuldu;

	}
}
