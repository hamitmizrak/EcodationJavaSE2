package com.ecodation1.ornekler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarClass {
	public static void main(String[] args) {

		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat degisken = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss zzzz", lokal);

		Calendar tarih = Calendar.getInstance();
		int str5 = tarih.getWeekYear();
		String str2 = degisken.format(tarih.getTime());
		System.out.println(str2);

	}
}
