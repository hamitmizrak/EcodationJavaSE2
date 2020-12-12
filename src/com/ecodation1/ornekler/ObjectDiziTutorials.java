package com.ecodation1.ornekler;

public class ObjectDiziTutorials {
	public static void main(String[] args) {
		Object[] dizi = new Object[5];
		dizi[0] = 44;
		dizi[1] = 44.44;
		dizi[2] = "Merhabalar";
		dizi[3] = true;
		dizi[4] = '@';

		for (Object temp : dizi) {
			System.out.println(temp);
		}
		System.out.println("debug tamamdır");

		System.out.println("sonradan eklendi.");
	}
}
