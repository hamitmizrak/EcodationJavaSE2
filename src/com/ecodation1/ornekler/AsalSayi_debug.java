
package com.ecodation1.ornekler;

import java.util.Scanner;

public class AsalSayi_debug {
//debug=hatay� ad�m ad�m ��zmeye yarar.
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		boolean flag = true;
		System.out.println("say� giriniz  giriniz");
		sayi = klavye.nextInt();

		// 1 ve kendisine b�l�nebilen say�lard�r.
		// en k���k asal say� 2

		try {

			if (sayi < 2) {
				System.out.println("2'den k���k say� giremeyiz");

			} else {

//asal say�lar 1 ve kendine b�l�nebilen   15 asal say� de�ildir= 1 15 3 5
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0) {
						flag = false;
						break;
					}

				}

				if (flag) {
					System.out.println(sayi + " say�s� " + "Asal say�d�r");
				} else {
					System.out.println(sayi + " say�s� " + "Asal say� de�ildir");
				}
			}

		} catch (Exception e) {
			System.out.println("L�tfen say� giriniz");

		}

	}
}
