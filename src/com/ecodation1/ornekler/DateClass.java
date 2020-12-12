
package com.ecodation1.ornekler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateClass {

	public static void main(String[] args) {

		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat degisken = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss zzzz", lokal);

		// @Deprecated
		Date date44 = new Date();
		String turkceTarih = degisken.format(date44);
		System.out.println(date44);
		System.out.println(turkceTarih);

	}

}
