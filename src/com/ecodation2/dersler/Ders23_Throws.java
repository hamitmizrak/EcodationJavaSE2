package com.ecodation2.dersler;

public class Ders23_Throws {
	public static void mailSend() {
		// System.out.println("Mail gönderiliyor.....");
	}

	public static void main(String[] args) {

		for (int i = 1; i < 10000; i++) {
			System.out.println("Program " + i);
		}

		try {
			int sonuc = 4 / 0;
			System.out.println(sonuc);
		} catch (ArithmeticException art) {
			mailSend();

		} catch (Exception e) {
			mailSend();

		}

		System.out.println("Program sonlandı." + "\nTebrikler 10.000 satıra geldik");

	}

}
