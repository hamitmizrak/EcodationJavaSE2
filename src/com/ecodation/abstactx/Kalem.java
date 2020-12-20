package com.ecodation.abstactx;

import java.io.Serializable;

//pojo: private+getter and Setter
//bean=pojo+constructor+method
public abstract class Kalem implements Serializable {
	private static final long serialVersionUID = 1695001919659511038L;

	// Nesne değişkeni Encapsulation
	private long id;
	private String adi;
	private String renk;
	private double fiyat;

	// parametresiz constructor
	public Kalem() {
	}

	// parametreli constructor
	public Kalem(long id, String adi, String renk, double fiyat) {
		super();
		this.id = id;
		this.adi = adi;
		this.renk = renk;
		this.fiyat = fiyat;
	}

	// Gövdeli methods
	public void getKalemBilgi() {
		System.out.println("ID: " + this.id + " Kalem adi: " + this.adi);
	}

	public String[] renkler() {
		String[] renkKodu = { "mavi", "kırmızı", "sarı" };
		return renkKodu;

	}

	// Gövdesiz method
	public abstract void getKalemRengi();

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getFiyat() {
		return this.fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	// toString
	@Override
	public String toString() {
		return "Kalemler [id=" + id + ", adi=" + adi + ", renk=" + renk + ", fiyat=" + fiyat + "]";
	}

}
