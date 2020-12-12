package com.ecodation1.ornekler;

public class DiziTersten {
	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4, 5 };
		int[] tersDizi = new int[dizi.length];
		for (int i = 0; i < dizi.length; i++) {
			tersDizi[dizi.length - i - 1] = dizi[i];

		}

		for (int temp : dizi) {
			System.out.print(temp);
		}

		System.out.println();
		for (int temp : tersDizi) {
			System.out.print(temp);
		}

	}
}
