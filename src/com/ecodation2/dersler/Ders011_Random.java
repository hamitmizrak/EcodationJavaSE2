package com.ecodation2.dersler;

import java.util.Random;

public class Ders011_Random {
	public static void main(String[] args) {
		// double rastgele = (Math.random() * 5 + 1); // 1 <=x<=5+1
		// System.err.println("rastgele sayılar:" + rastgele);

		Random random = new Random();
		int sayi = random.nextInt(5) + 1; // 1 <=x<=6
		// System.out.println(sayi);

		for (int i = 0; i <= 6; i++) {
			// sayi = i;
			System.out.print(" " + random.nextInt(5));

		}
		System.out.println(sayi);
	}

}
