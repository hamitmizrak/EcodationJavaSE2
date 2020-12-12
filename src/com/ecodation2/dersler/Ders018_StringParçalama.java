package com.ecodation2.dersler;

import java.util.StringTokenizer;

public class Ders018_StringParçalama {
	public static void main(String[] args) {

		// String Parçalama
		String kelime = "FatihKaraOsman , MügeKalkan , SerdarUnlu + TahirCanYıldız,UzayDurdu";

		// 1-)String Paraçlama split
		String[] kelimeDizi = kelime.split(",");
		for (String temp : kelimeDizi) {
			System.out.println(temp);
		}

		// 2-)StringTokenizer
		StringTokenizer stringTokenizer = new StringTokenizer(kelime);
		String parcalandi = null;
		while (stringTokenizer.hasMoreTokens()) {
			parcalandi = stringTokenizer.nextToken();

		}
		System.out.println(parcalandi);

		// StringTokenizer version-2
		StringTokenizer stringTokenizer2 = new StringTokenizer(kelime, ",+ ");
		String parcalandi2;
		while (stringTokenizer2.hasMoreTokens()) {
			parcalandi2 = stringTokenizer2.nextToken();
			System.out.println(" " + parcalandi2);
		}
	}

}
