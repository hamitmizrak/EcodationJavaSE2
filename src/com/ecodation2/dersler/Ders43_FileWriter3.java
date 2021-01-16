package com.ecodation2.dersler;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ders43_FileWriter3<T> {
	
	public static void main(String[] args) {
		// FileWriter fW2=new FileWriter(file,true);
		try (BufferedWriter bW = new BufferedWriter(new FileWriter("F:\\Şirket\\8_Ecodation\\dosya\\deneme3.txt"))) {
			bW.write("deneme2");
			System.out.println("işlem tamam");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
