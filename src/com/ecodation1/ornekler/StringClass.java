package com.ecodation1.ornekler;

public class StringClass {

	public static void main(String[] args) {
		String ecodation = "ileri,düzey Java SE ,ve ileri düzey ,JAVA EE git ";

//		System.out.println("boyutu: " + ecodation.length());
//		System.out.println("bütün karakter büyük:" + ecodation.toUpperCase());
//		System.out.println("bütün karakter küçük:" + ecodation.toLowerCase());
//		System.out.println();
//
//		System.out.println("boş mu: " + ecodation.isEmpty());
//		System.out.println("baş ve son boşlukları siler" + ecodation.trim());
//		System.out.println("replace: " + ecodation.replace("git", "sql"));
//		System.out.println();
//		System.out.println("compare to" + ecodation.compareTo("xyz"));
//		System.out.println("charAt:" + ecodation.charAt(5));
//		System.out.println("indexOf:" + ecodation.indexOf("a"));
//		System.out.println();
//		System.out.println(ecodation.substring(0, 5)); // 0<=x<5
//		System.out.println(ecodation.contains("ileri"));
//		System.out.println(ecodation.split(","));
//		String[] parcala = ecodation.split(" ");
//		for (String temp : parcala) {
//			System.out.println(temp);
//		}
//		

		System.out.println(ecodation.startsWith("ileri"));
		System.out.println(ecodation.endsWith("ileri"));
		System.out.println(ecodation.concat("Eğitim"));
		System.out.println(!ecodation.equals("ileri,düzey Java SE ,ve ileri düzey ,JAVA EE git "));
		System.out.println(ecodation == "ileri,düzey Java SE ,ve ileri düzey ,JAVA EE git ");

	}
}
