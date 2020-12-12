package com.ecodation2.ornek;

public class Ornekler013_Dongu_SayiCiftToplami {

	public static void main(String[] args) {
		// 1 - 10 kadar sayıların toplamı
		// 2'e bölünebilen sayılar toplamı
		// System.out.println(2+4+6+8+10);

		// 1+2+3+4+5+6+7+8+9+10
		// toplamada 0 eksisizdir.
		// çarpmada 1 etkisizdir.
		int sayi, toplam = 0;
		for (sayi = 1; sayi <= 10; sayi++) {
			if (sayi % 2 == 0) {
				toplam += sayi;

			}
			System.out.print(toplam + " ");
		}

		// System.out.println("bitiş");
	}
}
