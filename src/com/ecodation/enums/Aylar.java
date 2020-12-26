package com.ecodation.enums;

public enum Aylar {
	ocak(1, "OCAK"), subat(2, "ŞUBAT"), mart(4, "MART"), nisan(3, "NİSAN"), mayis(5, "MAYIS"), haziran(7, "HAZİRAN");
	
	private final int key;
	private final String value;
	
	private Aylar(int key, String value) {
		this.key   = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
