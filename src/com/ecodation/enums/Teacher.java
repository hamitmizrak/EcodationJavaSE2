package com.ecodation.enums;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {
	private static final long serialVersionUID = 2424598430305268129L;
	
	@Override
	public void bilgiler() {
		System.out.println("öğretmen Bilgileri");
		
	}
	
	@Override
	public void bilgiler(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
