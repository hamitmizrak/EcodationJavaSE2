package com.ecodation1.ornekler;

import java.io.Serializable;

public abstract class KemanYayliCalgilar implements Serializable {
	private static final long serialVersionUID = -8793265559806160107L;

	// nesne değişkenleri
	private String yayliCalgi;

	// parametresiz constrcutor
	public KemanYayliCalgilar() {

	}

	// parametreli constructor
	public KemanYayliCalgilar(String yaylicailgiAdi) {
		super();
		this.yayliCalgi = yaylicailgiAdi;
	}

	// getter setter
	public String getYaylicailgiAdi() {
		return yayliCalgi;
	}

	public void setYaylicailgiAdi(String yaylicailgiAdi) {
		this.yayliCalgi = yaylicailgiAdi;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
