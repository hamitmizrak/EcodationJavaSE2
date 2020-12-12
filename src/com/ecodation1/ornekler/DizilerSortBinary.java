package com.ecodation1.ornekler;

import java.util.Arrays;

public class DizilerSortBinary {

	public static void main(String[] args) {
		int[] dizi = { 2, 3, 1, 0 };
		for (int temp : dizi) {
			System.out.print(temp);
		}

		System.out.println();
		Arrays.sort(dizi);
		for (int temp : dizi) {
			System.out.print(temp);
		}
		System.out.println();
		int result = Arrays.binarySearch(dizi, 9);

		if (result < 0) {
			System.out.println("aradığınız yoktur");
		} else {
			System.out.println("aradığınız değer bulunmaktadır");
		}
	}
}
