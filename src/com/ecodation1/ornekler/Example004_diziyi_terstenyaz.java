package com.ecodation1.ornekler;

public class Example004_diziyi_terstenyaz {

	// 1 - 2 - 3 - 4 - 5
	// 5 - 4 - 3 - 2 - 1

	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4, 5 };
		int[] ters = new int[dizi.length];
		System.out.println("dizi boyutu:" + dizi.length);
		for (int temp : dizi) {
			System.out.print(temp);
		}

		for (int i = 0; i < dizi.length; i++) {
			ters[dizi.length - i - 1] = dizi[i];
		}

		System.out.println("\n\r");
		for (int temp : ters) {
			System.out.print(temp);
		}
	}
}
