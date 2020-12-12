package com.ecodation2.dersler;

public class Ders22_TryCatch {
	public static void mailSend() throws ArithmeticException {
		// System.out.println("Mail gönderiliyor.....");

		for (int i = 1; i < 10000; i++) {
			System.out.println("Program " + i);
		}

		int sonuc = 4 / 0;
		System.out.println(sonuc);

		System.out.println("Program sonlandı." + "\nTebrikler 10.000 satıra geldik");
	}

	public static void cell() {
		mailSend();
	}

	public static void main(String[] args) throws ArithmeticException {
		cell();
	}

}
