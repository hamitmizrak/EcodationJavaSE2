package com.ecodation.kalitimsiz;

import java.sql.Date;

public class KirmiziTukenmezKalem {

	private int id;
	private String KalemAdi = "Mavi tükenmez kalem";
	private double fiyat;
	private String SirketAdi;
	private Date yapilisTarihi;
	private String kalemRengi;

	public String getKalemRengi() {
		return kalemRengi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKalemAdi() {
		return KalemAdi;
	}

	public void setKalemAdi(String kalemAdi) {
		KalemAdi = kalemAdi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public String getSirketAdi() {
		return SirketAdi;
	}

	public void setSirketAdi(String sirketAdi) {
		SirketAdi = sirketAdi;
	}

	public Date getYapilisTarihi() {
		return yapilisTarihi;
	}

	public void setYapilisTarihi(Date yapilisTarihi) {
		this.yapilisTarihi = yapilisTarihi;
	}

}
