package com.ecodation1.ornekler;

public class TryTutorials {

	public static void main(String[] args) {

		try {
			int x = 0, y = 5;
			System.out.println("sonuç:" + (x / y));
		} catch (ArithmeticException a) {
			// System.out.println("Sıfıra bölme hatası");
			// a.getMessage();
			a.getStackTrace();
		} catch (Exception a) {
			System.out.println("genel hata");
		} finally {
			// ne olursa olsun kapatılacak olan yerdir.
		}

		System.out.println("deneme");
	}
}
