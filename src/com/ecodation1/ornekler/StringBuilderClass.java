package com.ecodation1.ornekler;

public class StringBuilderClass {

	public static void main(String[] args) {

		String kelime = "Ecodation" + " Java" + " İstanbul";
		System.out.print(kelime + "\n");

		// StringBuilder
		String db = "Malatya ";
		StringBuilder stringBuilder = new StringBuilder(db);
		stringBuilder.append(" 2 ").append(" 9 ").append(" 16 ");
		String cevirmen = stringBuilder.toString();
		System.out.println(cevirmen);
	}
}
