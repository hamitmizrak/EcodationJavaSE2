package com.ecodation2.dersler;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//generics Class
public class Ders40_File<T> {
	
	public static void main(String[] args) {
		
		String path = "F:\\Şirket\\8_Ecodation\\dosya\\deneme.txt";
		File file44 = new File(path);
		if (file44.exists()) {
			System.out.println("-------can------");
			System.out.println(file44.canExecute());
			System.out.println(file44.canRead());
			System.out.println(file44.canWrite());
			
			System.out.println("\n---------is---------");
			System.out.println(file44.isAbsolute());
			System.out.println(file44.isDirectory());
			System.out.println(file44.isFile());
			System.out.println(file44.isHidden());
			
			System.out.println("----------boyut---------");
			System.out.println(file44.length());
			
			System.out.println("--------- url---------");
			// System.out.println(file44.toURL());
			
			System.out.println("\n-----get-------");
			System.out.println(file44.getAbsolutePath()); // tam yolu
			System.out.println(file44.getPath()); // tam yolu
			System.out.println(file44.getName()); // dosya adını almak
			System.out.println(file44.getParent()); // üsteki ebeveynleri bulmak
			System.out.println(file44.getParentFile());
			System.out.println(file44.getFreeSpace());
			System.out.println(file44.getTotalSpace());
			System.out.println(file44.getClass());
			
			System.out.println("\n-----set-------");
			System.out.println(file44.setExecutable(false));
			
			System.out.println("--------- exist---------");
			System.out.println("dosya var mı? " + file44.exists());
			
			System.out.println("--------- lastModified---------");
			System.out.println("değişiklik tarihi " + file44.lastModified());
			Locale lokal = new Locale("tr", "TR");
			SimpleDateFormat sFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", lokal);
			Date date = new Date(file44.lastModified());
			String str = sFormat.format(date);
			System.out.println(str);
			System.out.println("-----------");
			
			/* Kaçtane dizin ve adını */
			File fileDongu = new File("F:\\Şirket\\8_Ecodation\\dosya\\");
			for (String temp : fileDongu.list()) {
				System.out.println(temp);
			}
			System.out.println("+++++++++++");
			/* */
			File fileDongu2 = new File("F:\\Şirket\\8_Ecodation\\dosya\\");
			for (File temp : fileDongu.listFiles()) {
				System.out.println(temp);
			}
			
			System.out.println("---------+++++++++-----------");
			for (File files : fileDongu2.listFiles()) {
				if (files.isDirectory()) {
					System.out.println("- " + files.getName());
				} else {
					System.out.println("+ " + files.getName() + files.length());
				}
			}
			
		}
	}
	
}
