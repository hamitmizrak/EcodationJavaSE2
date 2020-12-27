package com.ecodation2.dersler;

import java.util.HashMap;
import java.util.Map;

//generics Class
public class Ders35_HashMap<T> {
	
	public static void main(String[] args) {
		// K=Key V=Value H - HLT
		Map<Integer, String> mapList = new HashMap<>();
		mapList.put(1, "Müge");
		mapList.put(2, "Serdar");
		mapList.put(3, "Ulaş");
		mapList.put(4, "Uzay");
		mapList.put(5, "Yasemin");
		mapList.put(6, "Zeynep");
		
		if (mapList.isEmpty()) {
			System.out.println("Eleman yok");
		} else {
			System.out.println("Eleman var");
		}
		
		// mapList.remove(0);
		
		for (Object temp : mapList.keySet()) {
			System.out.println(temp);
		}
		
	}
	
}
