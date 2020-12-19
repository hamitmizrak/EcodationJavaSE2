package com.ecodation.randomuuid2;

public class MainTest {

	public static void main(String[] args) {

		RandomUUIDClass benzersizID = new RandomUUIDClass();
		String uuidKelime = benzersizID.uuidMethod();
		System.out.println(uuidKelime);
	}
}
