package com.ecodation2.dersler;

import java.util.Iterator;
import java.util.TreeSet;

//generics Class
public class Ders32_TreeSet<T> {
	
	public static void main(String[] args) {
		/*
		 * liste = L-A-V (LinkedList - ArrayList - Vector) ==> TEKRARLI VE/VEYA
		 * TEKRARSIZ set = H-L-T (HashSet - LinkedSet-TreeSet) =TEKRARSIZ Map = H-H-L-T
		 * (HashTable- HashMap - LinkedHashMap -TreeMap) =KEY-VALUE
		 * 
		 */
		
		// Asenkron = Sıra beklemeden herkes kendi kafasına göre çalışıyor.
		// LAV
		// List list44 = new LinkedList();
		// Araya yerleşme silme List<String> list41 =new LinkedList<>(); // Diamond
		// operator
		
		// H=hashSet L=linkedHashSet T=treeSet
		// LinkedHashSet: eklediğimiz sırada indisi ekranda gösterir.
		java.util.Set<String> listeProduct = new TreeSet<String>();
		listeProduct.add("Ahmet");
		listeProduct.add("2");
		listeProduct.add("Mehmet");
		listeProduct.add("4");
		listeProduct.add("5");
		listeProduct.add("6");
		
		for (String temp : listeProduct) {
			System.out.println(temp);
		}
		
		System.out.println("-----------");
		Iterator<String> ite = listeProduct.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
}
