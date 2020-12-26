package com.ecodation.enums;

import java.io.Serializable;

//bean 
abstract public class Person implements Serializable {
	private static final long serialVersionUID = -687760796536976433L;
	private Long kimlikNo;
	private String isim;
	private String soyisim;
	private String kanGrubu;
	
	// parametresiz kurucu method
	public Person() {
		kimlikNo = 10234567895L;
		isim     = "Hamit";
		soyisim  = "Mızrak";
		kanGrubu = "Belirtilmedi.";
	}
	
	// parametreli kurucu method
	public Person(long kimlikNo, String isim, String soyisim, String kanGrubu) {
		super();
		this.kimlikNo = kimlikNo;
		this.isim     = isim;
		this.soyisim  = soyisim;
		this.kanGrubu = kanGrubu;
	}
	
	// Overloading
	abstract public void bilgiler();
	abstract public void bilgiler(long id);
	
	// getter and setter
	public long getKimlikNo() {
		return kimlikNo;
	}
	public void setKimlikNo(long kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getKanGrubu() {
		return kanGrubu;
	}
	public void setKanGrubu(String kanGrubu) {
		this.kanGrubu = kanGrubu;
	}
	
	@Override
	public String toString() {
		return "Person [kimlikNo=" + kimlikNo + ", isim=" + isim + ", soyisim=" + soyisim + ", kanGrubu=" + kanGrubu
			+ "]";
	}
	
}
