package com.ecodation.enums;

import java.io.Serializable;

public class Students extends Person implements Serializable {
	private static final long serialVersionUID = -3440605029983637087L;
	
	@Override
	public void bilgiler() {
		System.out.println("Öğrenci bilgileri");
		
	}
	
	@Override
	public void bilgiler(long id) {
		System.out.println(id);
		
	}
	
}
