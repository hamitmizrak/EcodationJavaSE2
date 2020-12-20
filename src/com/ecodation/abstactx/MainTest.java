package com.ecodation.abstactx;

public class MainTest {

	public static void main(String[] args) {
		// Kalem kalem = new Kalem();
		// kalem.setId(45);
		// System.out.println(kalem);

		FosforluKalem fosforluKalem = new FosforluKalem();
		fosforluKalem.setAdi("Fosforlu kalem");
		fosforluKalem.setFiyat(10);
		fosforluKalem.getKalemBilgi();
		fosforluKalem.getKalemRengi(); // polymorphism
		// System.out.println(fosforluKalem);

		System.out.println("-------------------");
		// poly-morphism
		Kalem tukenmezKalem = new TukenmezKalem(); // polymorphism
		tukenmezKalem.setAdi("Tükenmez Kalem");
		tukenmezKalem.getKalemBilgi();
		tukenmezKalem.setFiyat(15);
		tukenmezKalem.getKalemRengi(); // polymorphism
		// System.out.println(tukenmezKalem);

	}
}
