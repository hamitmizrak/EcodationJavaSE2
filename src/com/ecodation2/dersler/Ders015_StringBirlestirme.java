package com.ecodation2.dersler;

public class Ders015_StringBirlestirme {
	public static void main(String[] args) {
		// String birleştirme
		// String str2,str3
		System.out.println(4 + 5);
		System.out.println("4" + 5);

		// 1-) + operant String birleşitmesi =performansı düşüktür.
		String str2 = "Malatya";
		String str3 = "İstanbul";
		String result = str2 + " " + str3;
		System.out.println(result);

		// 2-) concat = String Birleştirme
		String str6 = "Merhabalar";
		str6 = str6.concat(" concat ekledim");
		System.out.println(str6);

		// 3-) StringBuilder
		String baslangic = "Hamit Mızrak";
		StringBuilder stringBuilder = new StringBuilder(baslangic);
		stringBuilder.append(" ").append(" Html5 ").append(" Css3 ").append(" JS").append(" Jquery")
				.append(" Bootstrap").append(" responsive ").append(" Java Core").append(" Java EE").append(" ");
		String stringCevir = stringBuilder.toString();
		System.out.println(stringCevir);

	}

}
