package com.ecodation2.dersler;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ders44_FileReader<T> {
	
	public static void main(String[] args) {
		
		try (BufferedReader bR = new BufferedReader(new FileReader("F:\\Şirket\\8_Ecodation\\dosya\\deneme3.txt"))) {
			String okunan = "";
			String satir = "";
			while ((satir = bR.readLine()) != null) {
				okunan += satir + " "; // StringBuilder yerine artı(+)operantıyla birleştirdim.
			}
			
			// System.out.println("işlem tamam");
			System.out.println(okunan);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
