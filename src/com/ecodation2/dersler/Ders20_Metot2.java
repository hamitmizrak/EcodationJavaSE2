package com.ecodation2.dersler;

public class Ders20_Metot2 {
	public static void main(String[] args) {
		// static olmadan çağırma
		// sınıf.metotAdi();
		Ders019_Metot sinif = new Ders019_Metot();
		// private dolayı
		int sonuc = sinif.toplaMetodu(4, 6); // farklı classlarda private çağışmaz. //encapsulation
		System.out.println(sonuc);

	}

}
