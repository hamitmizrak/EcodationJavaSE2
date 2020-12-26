package com.ecodation.generics;

public class TelephoneNormal {
	
	private long id;
	private String name;
	
	public TelephoneNormal() {
		// TODO Auto-generated constructor stub
	}
	
	public TelephoneNormal(long id, String name) {
		super();
		this.id   = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
