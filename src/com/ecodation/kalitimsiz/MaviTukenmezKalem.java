package com.ecodation.kalitimsiz;

import java.sql.Date;

public class MaviTukenmezKalem {

	private int id;
	private String KalemAdi = "Kırmızı tükenmez kalem";
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

	@Override
	public String toString() {
		return "MaviTukenmezKalem [id=" + id + ", KalemAdi=" + KalemAdi + ", fiyat=" + fiyat + ", SirketAdi="
				+ SirketAdi + ", yapilisTarihi=" + yapilisTarihi + "]";
	}

}
