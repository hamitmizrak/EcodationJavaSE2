package com.ecodation1.ornekler;

import java.util.Scanner;

public class DiziExample001_Console_Dizi_Boyut {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		String sembol;
		System.out.println("lufen for sembolu icin sayi giriniz");
		sembol = klavye.nextLine();

		System.out.println("lutfen satir icin sayi giriniz.");
		satir = klavye.nextInt();

		System.out.println("lutfen sutun icin sayi giriniz.");
		sutun = klavye.nextInt();
		System.out.println(" girdigniz satir:" + satir + " girdininiz sutun: " + sutun);

		int[][] matrix = new int[satir][sutun];

		for (int i = 0; i < matrix.length; i++) {// satır
			for (int j = 0; j < matrix.length; j++) {// sutun
				System.out.print(matrix[i][j] = Integer.valueOf(sembol));
			}
			System.out.println();
		}
	}

}
