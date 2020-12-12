package com.ecodation2.ornek;

import java.util.Scanner;

public class Ornekler004_Haftanın_günleri2 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Çalışıyor musunuz");
		String work = klavye.nextLine();

		String result = work.equals("evet") ? "çalışıyor" : "çalışmıyor";
		// String result = work.equalsIgnoreCase("evet") ? "çalışıyor" : "çalışmıyor";
		System.out.println(result);

	}
}
