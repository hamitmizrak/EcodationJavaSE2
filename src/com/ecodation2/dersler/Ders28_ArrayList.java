package com.ecodation2.dersler;

/*
 * import java.util.ArrayList; import java.util.LinkedList; import
 * java.util.List;
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//import java.util.*;

//generics Class
public class Ders28_ArrayList<T> {
	private T deneme;
	
	// generic s constructor
	public Ders28_ArrayList(T deneme) {
		super();
		this.deneme = deneme;
	}
	
//generics getter setter
	public T getDeneme() {
		return deneme;
	}
	
	public void setDeneme(T deneme) {
		this.deneme = deneme;
	}
	// generic method
	public <T2> void method(T2 x) {
		
	}
	
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
		
		//
		List<String> list42 = new LinkedList<String>(); // Diamond operator
		list42.add("Müge");
		list42.add("Serdar");
		list42.add("Ulaş");
		list42.add("Yasemin");
		System.out.println(list42.size()); // size boyut
		System.out.println(list42.get(0)); // get(indis) eleman getirir.
		
		ArrayList<String> listeProduct = new ArrayList<String>();
		listeProduct.add("Hamit");
		listeProduct.add("Java");
		listeProduct.add("Frond-end");
		
		listeProduct.addAll(list42);
		System.out.println(listeProduct.size());
		System.out.println(listeProduct.get(0));
		System.out.println(listeProduct.get(6));
		
		listeProduct.remove(0);
		System.out.println(listeProduct.get(0));
		System.out.println("remove'dan sonra");
		listeProduct.clear();
		System.out.println(listeProduct.size());
		System.out.println(listeProduct);
		listeProduct.add("deneme");
		listeProduct.add("deneme2");
		listeProduct.add("deneme6");
		listeProduct.add("deneme3");
		listeProduct.add("deneme4");
		listeProduct.add("deneme7");
		listeProduct.add("deneme5");
		System.out.println(listeProduct.subList(0, 2)); // 0<=x<=2-1
		// System.out.println(listeProduct.get(0));
		System.out.println(listeProduct.indexOf("deneme4")); // aramayla ilgili işlemler
		
		for (String temp : listeProduct) {
			System.out.println(temp);
		}
		// Arrays.sort(a);
		for (String temp : listeProduct) {
			System.out.println(temp);
		}
		System.out.println("-----------");
		// Arrays.sort(al);
		java.util.Collections.sort(listeProduct);
		for (String temp : listeProduct) {
			System.out.println(temp);
		}
		
		Collections.reverse(listeProduct); // büyükten küçüğe sıralama
		
	}
	
}
