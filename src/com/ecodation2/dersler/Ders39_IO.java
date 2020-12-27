package com.ecodation2.dersler;

//generics Class
public class Ders39_IO<T> {
	
	public static void main(String[] args) {
		
		try {
			int x = 0 / 0;
		} catch (Exception e) {
			System.out.println("Sıfıra bölemezsin");
			throw new ArithmeticException("Sıfıra bölme");
		} finally {
			// kapatılmasını zorunlu olarak istediğimiz işlemelerimizde
		}
		System.out.println("denem");
	}
	
}
