package com.ecodation2.dersler;

public class Ders26_Format {

	public static void main(String[] args) {
		String kelime = "Java SE";
		int tamSayi = 44;
		float virgullu = 34.34f;

		System.out.printf("%s %d %f", kelime, tamSayi, virgullu);
		System.out.println();
		System.out.printf("%s %10d %f", kelime, tamSayi, virgullu);
		System.out.println("----------------\n");

		System.out.printf("%s %d %f", kelime, tamSayi, virgullu);
		System.out.println("Unutmayalım aynı sırada olmalıdır yoksa aşağıdaki hatayı alırız.");
		System.out.printf("%s %d %14.5f", tamSayi, kelime, virgullu);
		/*
		 * System.out.print("inline "); System.out.println("block");
		 * System.err.println("error"); System.out.printf("format");
		 */
	}

}
