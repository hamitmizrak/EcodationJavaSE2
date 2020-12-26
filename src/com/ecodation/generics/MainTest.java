package com.ecodation.generics;

public class MainTest {
	public static void main(String[] args) {
		TelephoneNormal telephoneNormal = new TelephoneNormal();
		String sayitoString = "44";
		int sayi = Integer.valueOf(sayitoString);
		telephoneNormal.setId(sayi);
		
		System.out.println("--------------------");
		TelefonGenerics<Integer> telephoneGenerics = new TelefonGenerics<>();
		telephoneGenerics.setId(44);
		// System.out.println(telephoneGenerics.getId());
		telephoneGenerics.denemeGenericsMethods(true, "kelime");
	}
}
