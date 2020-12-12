package com.ecodation1.ornekler;

public class Example003_dizi_kopyalama {

	public static void main(String[] args) {
		// dizi olacak diziyi başka yerde kopyalamak

		int[] dizi = { 5, 0, 1, 2, 3 };
		int[] clone = new int[dizi.length];

		for (int i = 0; i < dizi.length; i++) {
			clone[i] = dizi[i];
		}

		for (int temp : dizi) {
			System.out.print(temp);
		}
		System.out.println("\n\r");
		// forEach
		for (Object temp : clone) {
			System.out.print(temp);
		}
	}
}
