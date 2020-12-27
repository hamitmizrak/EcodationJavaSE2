package com.ecodation2.dersler;

/*
 * import java.util.ArrayList; import java.util.LinkedList; import
 * java.util.List;
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.*;

//generics Class
public class Ders27_Collection<T> {
	private T deneme;
	
	// generic s constructor
	public Ders27_Collection(T deneme) {
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
		
		List<String> listeProduct = new ArrayList<String>();
		
		listeProduct.add("deneme1");
		listeProduct.add("deneme2");
		listeProduct.add("deneme6");
		listeProduct.add("deneme3");
		listeProduct.add("deneme4");
		listeProduct.add("deneme7");
		listeProduct.add("deneme5");
		
		System.out.println("----------Normal iterative--------------");
		for (int i = 0; i < listeProduct.size(); i++) {
			System.out.println(listeProduct.get(i));
		}
		
		System.out.println("----------forEach------------");
		for (Object temp : listeProduct) {
			System.out.println(temp);
		}
		
		System.out.println("--------iterator------");
		Iterator<String> ite = listeProduct.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
}
