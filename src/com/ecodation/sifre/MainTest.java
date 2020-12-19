package com.ecodation.sifre;

public class MainTest {

	public static void main(String[] args) {
		String sifreledim = EncoderDecoderClass.encoderMethod(EncoderDecoderClass.klavyeMethod());
		System.out.println(sifreledim);

		String sifreCozuldu = EncoderDecoderClass.decoderMethod(sifreledim);
		System.err.println(sifreCozuldu);
	}
}
