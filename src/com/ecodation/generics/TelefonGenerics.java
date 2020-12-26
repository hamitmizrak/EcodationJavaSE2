package com.ecodation.generics;

public class TelefonGenerics<T> {
	
	private T id;
	private String name;
	
	// parametresiz constructor
	public TelefonGenerics() {
	}
	
	// parametreli constructor
	public TelefonGenerics(T id, String name) {
		super();
		this.id   = id;
		this.name = name;
	}
	
	public <T3> void denemeGenericsMethods(T3 t1, T3 t2) {
		System.out.println(t1);
		System.out.println(t2);
	}
	
	// sadece sayı kullanabilirsin
	public static <T extends Number> void JenerikMethod(T t) {// extends silebilirsin.
		System.out.println(t);
	}
	
	public <T5> void donus(T5 toplam, T5 toplam2) {
		// return toplam + toplam2;
	}
	
	// getter and setter
	public T getId() {
		return id;
	}
	
	public void setId(T id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
