package com.ecodation2.dersler;

public class Ders006_LocalGlobalVariable {
	public static void main(String[] args) {
		// db servisler Json
		String kelime = "Ecodation Java";
		System.out.println("boyutu: " + kelime.length()); // boşluklarıda sayıyor
		System.out.println("charAt: " + kelime.charAt(0));
		System.out.println("concat: " + kelime.concat(" SE"));
		System.out.println("orijinal: " + kelime);
		String birlestirilmis = kelime.concat("SE");
		kelime = birlestirilmis;
		System.out.println(kelime);

		//
		System.out.println(kelime.startsWith("E"));
		boolean sonuc = kelime.startsWith("E");
		if (sonuc) {
			System.out.println("E ile başlıyor");
		} else
			System.out.println("Başlamıyor");

		boolean sonuc2 = kelime.endsWith("E");

		// contains
		System.out.println("contains: " + kelime.contains("Java"));
		boolean icerik = kelime.contains("Java");
		if (icerik) {
			System.out.println("böyle bir içerik bulunuyor");
		} else
			System.out.println("bulunmuyor");

		// equals
		// System.out.println(kelime.equals("asdasd"));
		boolean isEsitmi = kelime.equals("asd");
		if (isEsitmi) {
			System.out.println("eşittir");
		} else
			System.out.println("eşit değildir");

		//
		// System.out.println(kelime.isEmpty());
		if (!kelime.isEmpty()) {
			System.out.println("dolu");
		} else
			System.out.println("boş");

		String kelime2 = "deneme ";
		System.out.println(kelime2.replace("deneme", "deneme5"));
		System.out.println(kelime.toLowerCase());
		System.out.println(kelime.toUpperCase());

		System.out.println("boşluklar alındı: " + kelime.trim());
		System.out.println("--------------------");

		String isim = "Hamit Mızrak";
		String[] dizi = isim.split(" ");

		for (String temp : dizi) {
			System.out.print(" " + temp);
		}
		System.out.println("+++++++++");
		System.out.println(dizi[1] + " " + dizi[0]);

		System.out.println("**********************");
		String kelime3 = "Ecodation";
		System.out.println(kelime3.substring(6));
		// System.out.println(kelime3.substring(10)); hata verecek String index out od
		// range -1
		System.out.println(kelime3.substring(0, 5)); // 0<= x< = 4

	}

}
