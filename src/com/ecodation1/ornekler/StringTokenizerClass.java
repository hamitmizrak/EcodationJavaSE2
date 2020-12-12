package com.ecodation1.ornekler;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {

		/*
		 * 
		 * StringTokenizer sTok=new StringTokenizer(str,"&, "); //Parçalama yapmak için
		 * Parametreyi baştan verimek gerekiyor. &,boşluk &=ampersand ~=tilda
		 * while(sTok.hasMoreTokens()){//Stringler olduğunca bunu yapmaya devam et.
		 * String tok=sTok.nextToken(); //bir sonraki tokena git
		 * System.out.println("Hepsi:"+tok);
		 * 
		 * }
		 * 
		 * 
		 */

		String kelime = "Ecodation JavaSE JavaEE SQL,APİ GİT|Html5 Css3,JS Jqery Bootstrap Android";
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, "|,");
		while (stringTokenizer.hasMoreTokens()) {
			String temp = stringTokenizer.nextToken();
			System.out.println(temp);

		}

	}
}
