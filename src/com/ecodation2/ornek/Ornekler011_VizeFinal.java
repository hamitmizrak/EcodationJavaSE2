package com.ecodation2.ornek;

import java.util.Scanner;

public class Ornekler011_VizeFinal {

	public static void main(String[] args) {
		// global değişkenleri
		double vizeNotes = 0.0, finalNotes = 0.0, result = 0.0;
		String nameSurname;
		Scanner klavye = new Scanner(System.in);

		System.out.println("Vize notunuz ?");
		vizeNotes = klavye.nextDouble();

		System.out.println("Final notunuz ?");
		finalNotes = klavye.nextDouble();

		System.out.println("Adınız ve soyadınız ?");
		nameSurname = klavye.nextLine();

		// result= vize*40/100+final*60/100
		// 50<=result<=60 CD
		// 61<=result<=70 CC
		// 71<=result<=80 BA
		// 81=result<=100 AA

		result = (((vizeNotes * 40) / 100) + ((finalNotes * 60) / 100));
		System.out.println("adınız: " + nameSurname);
		if (50 <= result && result < 60) {
			System.out.println("notunuz: " + result + " CD sorumlu geçtiniz");
		} else if (60 <= result && result < 70) {
			System.out.println("notunuz: " + result + " CC  geçtiniz");
		} else if (70 <= result && result < 80) {
			System.out.println("notunuz: " + result + " BA  geçtiniz");
		} else {
			System.out.println("notunuz: " + result + " AA  geçtiniz");
		}

	}
}
