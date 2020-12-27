package com.ecodation2.dersler;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ders42_FileWriter2<T> {
	
	public static void main(String[] args) {
		
		String path = "F:\\Şirket\\8_Ecodation\\dosya\\deneme2.txt";
		try (BufferedWriter bW = new BufferedWriter(new FileWriter(path))) {
			bW.write("deneme");
			System.out.println("işlem tamam");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
