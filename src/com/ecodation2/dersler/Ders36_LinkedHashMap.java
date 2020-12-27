package com.ecodation2.dersler;

import java.util.LinkedHashMap;
import java.util.Map;

//generics Class
public class Ders36_LinkedHashMap<T> {
	
	public static void main(String[] args) {
		// K=Key V=Value H - HLT
		// Eklediğimiz sırada bize verileri veriyor
		Map<Integer, String> mapList = new LinkedHashMap<Integer, String>();
		mapList.put(1, "Müge");
		mapList.put(2, "Serdar");
		mapList.put(3, "Ulaş");
		mapList.put(4, "Uzay");
		mapList.put(5, "Yasemin");
		mapList.put(6, "Zeynep");
		
		// mapList.remove(0);
		
		// key erişmek
		for (Integer key : mapList.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("-----------");
		// values'lere erişmek
		for (String value : mapList.values()) {
			System.out.println(value);
		}
		
		/*
		 * for(String ulke:city.keySet()){ String hepsi=city.get(ulke);
		 * System.out.println(ulke+" "+hepsi); }
		 * 
		 */
		System.out.println("-------------");
		// key+values
		for (Object object : mapList.keySet()) {
			String hepsi = mapList.get(object);
			System.out.println(object + " " + hepsi);
		}
	}
	
}
