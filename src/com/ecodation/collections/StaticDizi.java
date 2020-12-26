package com.ecodation.collections;

public class StaticDizi {
	
	public static void main(String[] args) {
		int[] dizi = new int[100];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}
		
		for (Object o1 : dizi) {
			System.out.print(o1 + " ");
		}
	}
	
}
