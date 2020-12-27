package com.ecodation2.dersler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ders41_FileWriter<T> {
	
	public static void main(String[] args) throws IOException {
		
		String path = "F:\\Şirket\\8_Ecodation\\dosya\\deneme2.txt";
		BufferedWriter bW = null;
		FileWriter fW = null;
		
		try {
			fW = new FileWriter(path);
			bW = new BufferedWriter(fW);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (bW != null) {
				bW.close();
			}
		}
	}
	
}
