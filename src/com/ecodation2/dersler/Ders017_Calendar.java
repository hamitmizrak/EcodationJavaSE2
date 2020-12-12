package com.ecodation2.dersler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ders017_Calendar {
	public static void main(String[] args) {

		// NOT:depracated= eskimiştir yeni güncelli kullanın NOT:Calendar günceldir.
		// Genel kullanım tarih vermek istersek
		// tr=dil kodu ,TR=ülke kodu
		Locale turkiyeLocal = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss zzzz", turkiyeLocal);

		// Tarih
		Date tarih = new Date();
		System.out.println(tarih);

		Calendar tarihLocal = Calendar.getInstance();
		String formatliTarih = simpleDateFormat.format(tarihLocal.getTime());
		System.out.println(formatliTarih);

	}

}
