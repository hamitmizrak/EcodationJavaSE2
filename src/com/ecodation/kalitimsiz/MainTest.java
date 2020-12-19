package com.ecodation.kalitimsiz;

public class MainTest {

	public static void main(String[] args) {

		FosforluKalem fosforluKalem = new FosforluKalem();
		System.out.println(fosforluKalem);

		MaviTukenmezKalem maviTukenmezKalem = new MaviTukenmezKalem();
		maviTukenmezKalem.setFiyat(23.44);
		maviTukenmezKalem.setKalemAdi("Güzel mavi Tükenmez kalem");
		System.out.println(maviTukenmezKalem);
	}

}
