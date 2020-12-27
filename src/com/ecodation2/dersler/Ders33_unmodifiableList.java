package com.ecodation2.dersler;

import java.util.ArrayList;
import java.util.List;

//generics Class
public class Ders33_unmodifiableList<T> {
	
	public static void main(String[] args) {
		// Bazen listlere ekleme yapılmasını istemem.
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(44);
		liste.add(23);
		liste.add(34);
		liste = java.util.Collections.unmodifiableList(liste);
		liste.add(21);
		for (Integer temp : liste) {
			System.out.println(temp);
		}
	}
	
}
