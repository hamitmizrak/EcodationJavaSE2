package com.ecodation.innerclass;

public class DisClass {
	// Nesne değişkenleri
	private String ad;
	private String soyad;
	private int yas;

	public static class icClass {
		private String ozelBilgiler;

		public String getOzelBilgiler() {
			return ozelBilgiler;
		}

		public void setOzelBilgiler(String ozelBilgiler) {
			this.ozelBilgiler = ozelBilgiler;
		}

	}

	// getter and setter
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}

/*
 * Ulke.Sehir.Mahalle mahalleler=new Ulke().new Sehir().new Mahalle();
 * mahalleler.mahalleMetot();
 * 
 * 
 */
