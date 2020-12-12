package com.ecodation2.ornek;

public class Ornekler010_continue {

	public static void main(String[] args) {

		int i = 0;
		do {
			System.out.println("Burası bir kere çalışacak");
			System.out.println(i);
			i = i + 2;
		} while (i < 10);
	}
}
