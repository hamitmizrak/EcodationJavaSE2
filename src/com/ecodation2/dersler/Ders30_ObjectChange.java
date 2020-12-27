package com.ecodation2.dersler;

import java.util.Stack;
import java.util.Vector;

public class Ders30_ObjectChange {
	
	public static void main(String[] args) {
		
// Object --> String --> Integer
	
//Vector ile ArrayList farkı:
//Vector: iş btmeden devam etmez
//ArrayList: iş bitmeden başka process gelebilir. Eş zamanlı çalışabilir
	
// başlangıçta benim değerim: 4 elemanlıdır sonra 4 eleman dolarsa üzerine 6 ekler
		Vector<Integer> vector = new Vector<>(4, 6);
		vector.add(21);
		
		Stack<Integer> lifo = new Stack<>();
		lifo.add(44);
		lifo.add(23);
		// son giren ilk
	}
	
}
