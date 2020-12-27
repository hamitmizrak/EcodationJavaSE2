package com.ecodation2.dersler;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//generics Class
public class Ders38_MapIterator<T> {
	
	public static void main(String[] args) {
		// K=Key V=Value H - HLT
		// Eklediğimiz sırada bize verileri veriyor
		Map<Integer, String> mapList = new TreeMap<Integer, String>();
		mapList.put(5, "Yasemin");
		mapList.put(1, "Müge");
		mapList.put(2, "Serdar");
		mapList.put(6, "Zeynep");
		mapList.put(3, "Ulaş");
		mapList.put(4, "Uzay");
		/*
		 * Set set=mapList.keySet(); Iterator ite=set.iterator(); While(ite.hasNext()){
		 * Sout(ite.next()); //sadece //sout(mapList.get(ite.next()); bununla bütün
		 * değerler
		 */
		
		Set<Integer> set = mapList.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
			System.out.println(ite.next() + " " + mapList.get(ite.next()));
		}
		
		System.out.println("---------");
		
		for (Map.Entry<Integer, String> m : mapList.entrySet()) {
			System.out.println(m);
		}
		
		System.out.println("------Lambda------");
		mapList.entrySet().forEach(System.out::println);
		
	}
	
}
